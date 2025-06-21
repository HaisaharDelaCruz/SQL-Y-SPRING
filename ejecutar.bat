@echo off
set RUTA_DLL=C:\sqljdbc_12.10.1.0_enu\sqljdbc_12.10\enu\auth\x64
java -Djava.library.path=%RUTA_DLL% -jar target/prueba-0.0.1-SNAPSHOT.jar
pause
