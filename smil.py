# -*- coding: utf-8 -*-
"""
Created on Wed Nov  2 12:15:53 2022

Problem found at: https://open.kattis.com/problems/smil

@author: Dan
"""

import sys

def print_list(my_list):
    for i in my_list:
        print(i)

def search_smiles():
    inp = sys.stdin.readline().strip("\n")
    start = 0
    smiles = []
    while start < len(inp):
        mouth = inp.find(")", start)
        if mouth == -1:
            break
        start = mouth+1
        if mouth == 1:
            if inp[mouth-1] == ":" or inp[mouth-1] == ";":
               smiles.append(mouth-1)
        elif mouth >= 2:
            #check for all smiles
            if inp[mouth-1] == ":" or inp[mouth-1] == ";":
               smiles.append(mouth-1)
            elif inp[mouth-1] == "-":
                if inp[mouth-2] == ":" or inp[mouth-2] == ";":
                    smiles.append(mouth-2)
    return smiles

def main():
    print_list(search_smiles())

if __name__ == '__main__':
    main()