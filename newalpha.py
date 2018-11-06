
## create dictionary for translation
translate = {
    "a": "@",
    "b": "8",
    "c": "(",
    "d": "|)",
    "e": "3",
    "f": "#",
    "g": "6",
    "h": "[-]",
    "i": "|",
    "j": "_|",
    "k": "|<",
    "l": "1",
    "m": "[]\/[]",
    "n": "[]\[]",
    "o": "0",
    "p": "|D",
    "q": "(,)",
    "r": "|Z",
    "s": "$",
    "t": "']['",
    "u": "|_|",
    "v": "\/",
    "w": "\/\/",
    "x": "}{",
    "y": "`/",
    "z": "2"
}

text = raw_input()
text = text.lower()
translated = ""
for char in range(len(text)):
    try:
        translated += translate[text[char]]
    except:
        translated += text[char]
print translated
    
