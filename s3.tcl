set ns [new Simulator]
set tracefile [open s3tr w]
$ns trace - all $ tracefile
set namfile [open s3.nam w]
$ns namtrace - all $namfile
proc finish {}{
global ns namfile tracefile
$ns flush-trace
close $namfile
close $tracefile
exec nam s3.nam &
exit 0
}

set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]
set n5 [$ns node]
set n6 [$ns node]

set n7 [$ns node]
set n8 [$ns node]

$ns color 1 Blue
$ns color 1 Red
$n7 shape box
$n7 color Blue
$n8 shape hexagon
$n8 color Red
$ns duplex - link $n1 $n0 2Mb 10ms DropTail
$ns duplex - link $n1 $n0 2Mb 10ms DropTail
$ns duplex - link $n1 $n0 2Mb 10ms DropTail
$ns make _ lan "$n3 $n4 $n5 $n6 $n7 $n8" 512Kb40ms LL Queue / DropTail Mac/802_3
$ns duplex - link - op $n1 $n0 orient right down
$ns duplex - link - op $n1 $n0 orient right - up
$ns duplex - link - op $n1 $n0 orient right 
$ns queue - limit $n0 $n3 20
set tcp1 [new Agent / TCP / Vegas ]
$ns attach - agent $n1 $tcp1
set sink 1 [newAgent / TCPSink ]
$ns attach - agent $n7 $sink1
set ftp 1 [new Application / FTP] 
$ftp1

 
