#!/usr/bin/env python3

from math import *
import time
import matplotlib.pyplot as plt
import energyusage as eu

def cancel(listing, start):
  for i in range(len(listing)):
    listing[i] = False
  return listing 

def lookup(const, start, listing):
  ii = cancel(listing, start) 
  for i in range(start, floor(sqrt(const))):
    if ii[i] == False:
      print("%s is Prime"% str(i) + "\n") 

      for j in range(i*i, len(ii) , i):
        ii[j] = True
  
  print(str(ii) + "\n") 
  return ii

def master(const, start, listing):
  ii = lookup(const, start, listing)  
  for i in range(floor(sqrt(const)+1), len(listing)):
    if ii[i] == False:
      print("%s is Prime"%str(i) + "\n")
      pass
    pass
  pass


startTime = time.time()
#print(gestrichen)
const = int(input("Const please: "))
start = int(input("Start please: "))
gestrichen = [i for i in range(start, const)]
print("It´s began")

master(const, start, gestrichen)

dir(eu)


"""
t = int(input("Number of test cases: "))
if t <= 10:
  for i in range(t):
"""    




