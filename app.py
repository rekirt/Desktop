#!/usr/bin/python
# -*- coding: UTF-8 -*-
import json

print()
print("Welcome to json analyze")
print("==========================")
print()

def analyzejson(text):
    jsonVlaue = json.loads(text)

    string = ""
    length = len(jsonVlaue)

    for key in jsonVlaue:
        string += key + "=" + jsonVlaue[key] + "&"


    string = string[0:-1]
    print(string)

print("input json string:")
text = input("> ")
while 1:
    if text == 'q' or text == 'quit':
        break
    else:
        analyzejson(text)
        text = input("> ")







