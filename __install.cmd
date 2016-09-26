@echo off
call npm install
call sbt update
call py -3 -m virtualenv python_modules
call px -m pip install --upgrade pip
call px -m pip install watchdog
call px -m pip install psutil
