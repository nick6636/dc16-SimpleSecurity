# Simple Security

# Team Members
Steven Scheffelaar Klots

# Project Description
Simple Security is an internet of things implementation that allows you to control
appliances connected to RF outlets from anywhere by connecting to a web server being hosted 
by a Raspberry Pi. Simple Security also notifies the user of a door sensor being triggered
and provides a live stream from a camera connected to the Raspberry Pi.

# Progress (Week 03/29)
Implemented an initial frontend/backend combination that provides a simplistic interface 
for turning on a single remote outlet, but not turn it off. The next step for this part of the project
is to implement the rest of the channels of the outlets nad to create a better looking UI.

#Progress (Week 4/5)
Implemented the angular infrastructure for the frontend and added functionality for turning on all of the lights.
Also did UI work to make the project look better.
The next step for me is researching databases and to decide which one to use (preferably one that works well with Flask)

#Progress (Week 4/12)
Implemented a simple Android app that can communicate with the Raspberry and can turn  any of the lights on or off.
Also began working on the Android Wear Companion App.

#Progress (Week 4/19)
Had to reimplement the service that I used to send HTTP requests to the Raspberry Pi as the one that I had written
would not work well with the Android Wear device. Still working on implementing the Android Wear portion of the app.

#Future Plans
Get a database working to record whether a light is on or off
Add user authentication so that not just anyone can control my lights
