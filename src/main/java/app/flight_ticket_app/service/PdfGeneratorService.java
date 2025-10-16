package app.flight_ticket_app.service;

import app.flight_ticket_app.model.Ticket;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;
import java.io.OutputStream;

@Service
public class PdfGeneratorService {

    public void generatePdf(Ticket ticket, OutputStream outputStream) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, outputStream);
            document.open();

            Font titleFont = new Font(Font.HELVETICA, 20, Font.BOLD);
            Font bodyFont = new Font(Font.HELVETICA, 12);

            document.add(new Paragraph("✈️ BOLETA DE VUELO", titleFont));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Nombre: " + ticket.getNombreCompleto(), bodyFont));
            document.add(new Paragraph("Número de Asiento: " + ticket.getNumeroAsiento(), bodyFont));
            document.add(new Paragraph("Clase: " + ticket.getClaseBoleto(), bodyFont));
            document.add(new Paragraph("Aerolínea: " + ticket.getAerolinea(), bodyFont));
            document.add(new Paragraph("Fecha y Hora de Vuelo: " + ticket.getFechaHoraVuelo(), bodyFont));
            document.add(new Paragraph("Origen: " + ticket.getPuntoOrigen(), bodyFont));
            document.add(new Paragraph("Destino: " + ticket.getPuntoDestino(), bodyFont));
            document.add(new Paragraph("Identificador del Boleto: " + ticket.getIdentificadorBoleto(), bodyFont));

            document.add(new Paragraph(" "));
            document.add(new Paragraph("Gracias por su compra. ¡Buen vuelo! ✈️", bodyFont));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
