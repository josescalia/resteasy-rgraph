resteasy-rgraph
===============
Lab for resteasy and rgraph implementation.

Website : [http://josescalia.net](http://josescalia.net)


##Description
It's only demonstrate how to create json using [resteasy](http://www.jboss.org/resteasy) framework for [rgraph](http://www.rgraph.net) implementation.
The data will fetch from database and manipulate to fit a class representing RGraph json format, The RGraph will consume this json format and visualize it using RGraph as a  graph stats.

###How To
####Configuring the application
1. Configure the database by editing file **applicationContext.xml** and **hibernate.cfg.xml**, and fit to your own database settings
2. Compile it with *mvn clean install*

####Running the application
1. Run it with *mvn jetty:run*
2. Open url [http://localhost:9095/services/application/index.html](http://localhost:9095/services/application/index.html) in your browser
2. Fill the data 1st by opening the form at **Demographic** menu
3. View the graph by opening the **Graph** menu



Enjoy

**Josescalia**

