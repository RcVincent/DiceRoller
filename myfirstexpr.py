#!/usr/bin/python

from mininet.topo import Topo
from mininet.net import Mininet
from mininet.util import dumpNodeConnections
from mininet.log

class MyFirstTopo(Topo):
    def _init_(self):
        Topo._init_(self)
        h1 = self.addHost('h1')
        h2 = self.addHost('h2')
        h3 = self.addHost('h3')
        h4 = self.addHost('h4')

        leftSwitch = self.addSwitch('s1')
        rightSwitch = self.addSwitch('s2')

        self.addLink(h1, leftSwitch)
        self.addLink(h2, leftSwitch)
        self.addLink(leftSwitch, rightSwitch)
        self.addLink(h3, rightSwitch)
        self.addLink(h4, rightSwitch)

def runExperiment():
    topo = MyFirstTopo( )
    net = Mininet(topo)
    net.start()

    dumpNodeConnections(net.hosts)

    net.pingAll()
    net.stop()

if _name_ == '_main_' :

    setLogLevel('info')
    runExperiment()
    
topos = { 'myfirsttopo': (lambda MyFirstTopo() )}
