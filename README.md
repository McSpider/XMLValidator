XMLValidator
============

This program was created to validate your xml files to the OCN modules. This program is not designed to make your XML files perfect but it should make them syntaxually correct so there are a lot fewer errors that the mapdevs have to spend time fixing when they could be doing more productive thigs. 

How to install and use
======================
1. Go to the releases section of this repository found [here](https://github.com/CaptainElliott/XMLValidator/releases)
2. Extract the file to a suitable place
3. Run the run.bat file and a command prompt screen and GUI should pop up.
4. Select your XML file using the GUI and the file chooser.
5. If there is an error in your file the GUI will show you what that error is but the command prompt window will give you the stack trace in which you can find information such as the line number

Supported Modules
=================

All if the OCN modules are supported except for the following:

- DEstroyables 
- Wools
- KotH
- Classes
- Mobs 

I your file contains any of these the comment them out temporarily so true validator does bot show an invalid XML file.
