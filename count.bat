@echo off
set "totalLines=0"

for /r "%cd%" %%f in (*.java) do (
    for /f %%n in ('type "%%f" ^| find /c /v ""') do (
        set /a "totalLines+=%%n"
    )
)

echo Total lines of code in all .java files: %totalLines%

