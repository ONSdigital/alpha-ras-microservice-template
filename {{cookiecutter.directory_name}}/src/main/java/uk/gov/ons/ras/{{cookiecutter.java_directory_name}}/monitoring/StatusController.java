package uk.gov.ons.ras.{{cookiecutter.project_name}}.monitoring;

/**
 * An interface for the StatusControler.
 * {{cookiecutter.project_name}}
 * @author
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
