package app.flight_ticket_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class FlightTicketAppApplication implements ApplicationListener<WebServerInitializedEvent> {

	public static void main(String[] args) {
		SpringApplication.run(FlightTicketAppApplication.class, args);
	}

	@Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
		int port = event.getWebServer().getPort();
		System.out.println("\n✅ Aplicación lista! Accede en: http://localhost:" + port + "\n");
	}
}