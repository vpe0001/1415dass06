#!/bin/sh
sourcepath=".:./lanSimulation/:./lanSimulation/internals/:./lanSimulation/tests/:"
classpath=":./junit.jar:"`/usr/bin/javaconfig  DefaultClasspath`
destinationpath="./built/"

classes="./lanSimulation/internals/Packet.java ./lanSimulation/internals/Node.java ./lanSimulation/Network.java ./lanSimulation/tests/LANTests.java ./lanSimulation/LANSimulation.java "

mkdir -p "$destinationpath"
javac -verbose -source 1.4 -target 1.4 -g -sourcepath "$sourcepath" -classpath "$classpath" -d "$destinationpath" $classes
