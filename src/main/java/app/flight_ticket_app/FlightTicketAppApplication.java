package app.flight_ticket_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class FlightTicketAppApplication implements ApplicationListener<WebServerInitializedEvent> {

	private int port;

	public static void main(String[] args) {
		SpringApplication.run(FlightTicketAppApplication.class, args);
		// System.out.println("\n🚀 Aplicación iniciada en: http://localhost:8080\n");
	}

	@Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
		this.port = event.getWebServer().getPort();
		System.out.println("\n✅ Servidor en ejecución en: http://localhost:" + port + "\n");
	}
}