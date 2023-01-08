# ShadercacheStatus
A tool to monitor the precise progress of shadercaching.

## Why?
For some games on Linux the shader preprocessing takes a lot of time.
You can decide to process the shaders in the background while gaming however on some devices this will reduce performance in such a way that the game is unplayable in some situations.
Additionally you can decide to preprocess them even on higher end devices to get that small performance gain in game.

The progress bar interface by Steam is unprecise and gives no clue about how much is actually being processed.
This tool will tell progress in percentage and how many shaders have been processed yet and how much more have to be processed.

## How?
This simple program actively checks the Steam shader log file and prints out the precise progress to the command line.

Initially the whole logfile is being read to memory then only changes will be monitored and added to the loaded version therefore reducing the CPU usage of the program to ensure that there is minimal overhead by using this tool.
Furthermore the logfile is only being written to every 10 seconds which allows to let the Thread sleep in that time.
