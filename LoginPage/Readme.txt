Challenges Faced:
                1.Redundancy in Code.
                2.layout understanding.
                 3.imported file usage.
                 4.Understanding and making it easier to use.
                5.Creating into one piece
                6.division of data

Description:

Main Class (LoginPage):

Extends JFrame: Represents the main window of the application.
Container (c): Retrieves the content pane of the frame.
Panels (PFlightTypes, PLogin, PFlightDetails): Used for organizing different parts of the UI.
Boolean (bCheck): Controls the visibility of flight details panels.
Labels (LDomesticFlight, LInternationalFlight, LDomesticFlight1, LInternationalFlight1): Display flight type headings.
TextFields (TFUserName) and PasswordFields (TPPassword): For user login credentials.
Button (BLogin): Initiates the login process.
Tables (TDomesticFlight, TInternationalFlight, TDomesticFlight1, TInternationalFlight1): Display flight details.
Scroll Panes (JSP1, JSP2, JSP3, JSP4): Provide scrolling functionality for tables.
Icons (img1, img2, img3, img4): Images used in labels.
Constructor (LoginPage()):

Set Look and Feel: Uses WindowUtilities.setNativeLookAndFeel() to set the native system look and feel.
Panel Settings: Sets backgrounds and bounds for the three main panels.
Component Initialization: Places labels, fields, buttons, and tables within their respective panels.
Action Listeners: Handles login button click (BLogin), validating username and password.
Mouse Listeners: Switches displayed flight details based on label clicks (LEconomic, LBusiness, LEconomic1, LBusiness1).
Window Listener: Handles window close event to exit the application.
Helper Class (WindowUtilities):

setNativeLookAndFeel(): Sets the look and feel of the UI to the system's default.
