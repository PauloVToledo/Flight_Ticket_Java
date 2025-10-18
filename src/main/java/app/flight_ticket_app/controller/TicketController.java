package app.flight_ticket_app.controller;

import app.flight_ticket_app.model.Ticket;
import app.flight_ticket_app.service.PdfGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@SessionAttributes("ticket")
public class TicketController {

    private final PdfGeneratorService pdfService;

    public TicketController(PdfGeneratorService pdfService) {
        this.pdfService = pdfService;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "form";
    }

    @PostMapping("/preview")
    public String showPreview(@ModelAttribute Ticket ticket, Model model) {
        model.addAttribute("ticket", ticket);
        return "preview";
    }

    @GetMapping("/download")
    public void downloadPdf(@ModelAttribute("ticket") Ticket ticket, HttpServletResponse response, SessionStatus status)
            throws IOException {

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=boleta.pdf");
        pdfService.generatePdf(ticket, response.getOutputStream()); // <-- La lógica de guardado y generación de PDF
                                                                    // está aquí
        status.setComplete();
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about";
    }

}
