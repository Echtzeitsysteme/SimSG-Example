# SimSG-Example

## Setup instructions
* Get Eclipse 2018-12 with Modeling Components

* Install SimSG http://emoflon.org/SimSG-UpdateSite
  * Window -> Install New Software..
  * Add.. -> Copy the URL to the "Location" form and enter a name of your choice
  * Tick all boxes
  * Manage.. -> tick all empty boxes (democles / emoflon::ibex have some additional dependencies)
  * Click on finish and let eclipse do its thing -> accept restart

* Open a fresh Eclipse workspace
* Import some SimSG examples as follows
  * In the Project Explorer, right-click, then choose "Import..."
  * Select "Git/Projects from Git".
  * Use the following URL: https://github.com/eMoflon/SimSG-Example with branch: master
  * Import all projects.

* Run the Java class *BiochemistryExample.java* in the package *example*
