# -*- coding: utf-8 -*-
"""
Created on Thu Sep 15 11:01:00 2022

Problem found at: https://open.kattis.com/problems/fodelsedagsmemorisering

@author: Dan
"""

import sys

nlines = int(sys.stdin.readline())

memory = {}
for i in range(0, nlines):
    name, score, date = sys.stdin.readline().split()
    if date not in memory:
        memory[date] = (name, score)
    elif int(score) > int(memory[date][1]): 
        memory[date] = (name, score)

#print(memory)
K = len(memory)
names = []
for a, b in memory.values():
    names.append(a)
names.sort()
print(K)
for name in names:
    print(name)
        