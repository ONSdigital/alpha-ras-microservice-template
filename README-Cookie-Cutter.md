# Cooke Cutter Guide

This is a short guide to populating your cookie cutter json file to create your micros service. If you are reading this
you have either cloned the whole project into a directory with a view to create your template microservice. Or you are
reading it via GitHub online.
This document will be a top down guide. How to use it ASAP via traditional method i.e. git clone. How to use it
directly from github to create your microservice. We then quickly tell you what each parameter does in the json file.

## Create A MicroService Via Git Clone

To create a default microservice in your current directory called "myDir", first clone the ras template microservice.
You may have already done this - but if you are reading online:

/> cd myDir
/> git clone https://github.com/ONSdigital/ras-microservice-template.git

This will create a directory within your current dir called {{cookiecutter.directory_name}}
Create a directory within your current dir called 'project'. It does not have to be this, but this is a good name choice.
Move to this directory

/> mkdir project
/> cd project

Run the cookiecutter command pointing the start point to your cookiecutter directory:

/> cookiecutter ../{{cookiecutter.directory_name}}

Follow the CLI menu. You can accept default values by hitting return or add your own.
There will be a fully working microservice deployed inside your project directory. It will have the attributes defined
within your cookiecutter.json file.


## Create A MicroService Via Direct Method

To create a default microservice in your current directory called "myDir" you can run cookieclutter directly from this
point and point it to the template repo.

/> cookiecutter https://github.com/ONSdigital/ras-microservice-template.git

Follow the CLI menu. You can accept default values by hitting return or add your own.
There will be a fully working microservice deployed inside your project directory. It will have the attributes defined
within your cookiecutter.json file.


## Parameters Naming

This section describes what each parameter 'name value pair' is used for in our cookiecutter.json file which is at the
route of the folder


### Directory Name
This is the directory name of the route path for the microservice.

        "directory_name": "ras-collection-instrument"

### Java Directory Name
This is the name of the final folder or the java source tree which hangs of 'uk.gov.ons.ras.<name>'. It's what makes
your name space unique in ONS world.

	"java_directory_name": "collection-instrument",

### File Name
This is not currently used. But can be used in future to identify a particular file name if a java class is created.

    "file_name": "collection_instrument"

### Project Name
The project name is used to describe the java package names within Java files. In this instance we have:
**Application.java
**MainController.java
**ServiceStatusmpl.java
**StatusController.java
**StatusControllerImpl.java

    "project_name":"collectionInstrument"

### Project Author Name
This populates author names with the java files created. Currently it is configured to be auto generated.

    "author_name": "Auto Generated"

###  Description Status
This is currently not used. It can be used to hold a description of the service and placed into a comment area of the
microservice comments java file.

    "description_status": "Interface to represent the service status"

### Return String
The main controller returns a default string when it's endpoint is hit within a browser. This populates the retrun
return string to quickly identify your microcontroller is working properly from within a browser.

    "return_string": "Collection Instrument"

### Application Name, Info App Description
This is for the java properties file to know how to build the project.

    "application_name": "collectionInstrument"
    "info_app_description":"Microservice for collection instrument"

### Gradle App Name, Gradle App Version
Gradle is a java package and build tool. It contains a graddle.properties file which controls the building of the
project. This allows you to set the version number and application name for the build tool.

    "gradle_app_name":"collectionInstrument"
    "gradle_app_version":"0.0.1"

### Component Scan
The default microserivce has the java annotation 'ComponentScan' in the Application.java file. This needs to know what
will be the project directory. We could use the same project directory variable for this item. But to be explicit it
has been held in a separate variable TODO - Remove this and test.

    "ComponentScan":"collectionInstrument"

