function getIP{

(Get-NetIPAddress).ipv4address | Select-String "192*"

}

Function localuser{

Get-localUser | select-string "Adm*"

}

Function hostname{

hostname
}

Function version{

$Host.Version.Major

}

Function body{

}

Function todaysdate{
get-date
}
