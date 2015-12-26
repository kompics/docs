#!/bin/bash

javasphinx-apidoc -o javadoc/core -t "Core" -f ../kompics/core/
javasphinx-apidoc -o javadoc/component-java-timer -t "Java Timer Component" -f ../kompics/basic/component-java-timer
javasphinx-apidoc -o javadoc/component-netty-network -t "Netty Network" -f ../kompics/basic/component-netty-network
javasphinx-apidoc -o javadoc/port-network -t "Network Port" -f ../kompics/basic/port-network 
javasphinx-apidoc -o javadoc/port-timer  -t "Timer Port" -f ../kompics/basic/port-timer
javasphinx-apidoc -o javadoc/port-virtual-network -t "Virtual Network Port" -f ../kompics/basic/port-virtual-network
javasphinx-apidoc -o javadoc/simulator -t "Simulator" -f ../kompics-simulator