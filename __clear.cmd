@echo off
pushd %~dp0
rmdir /q /s node_modules
rmdir /q /s python_modules
rmdir /q /s out
rmdir /q /s project\project
rmdir /q /s project\target
rmdir /q /s target
popd