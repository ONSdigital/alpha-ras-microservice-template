package uk.gov.ons.ras.respondent.monitoring;

/**
 * An interface for the StatusControler.
 * 
 * @author pricem
 * 
 */
public interface StatusController {

    /**
     * Info about this service.
     * 
     * @return the service status.
     */
    ServiceStatus status();

}
