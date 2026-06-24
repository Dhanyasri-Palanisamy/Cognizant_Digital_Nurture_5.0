@echo off
set /p msg="Enter the commit message: "
cd /d "D:\springboot Learning"
git add .
git commit -m "%msg%"
git push origin master
pause