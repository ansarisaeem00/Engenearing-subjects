# Author: Ansari  M.Saeem M.Saleem
# Aim : Implimentation of caesar cypher 

def encrypt(text,s):
	result = ""

	# traverse text
	for i in range(len(text)):
		char = text[i]

		# Encrypt uppercase characters
		if (char.isupper()):
			result += chr((ord(char) + s-65) % 26 + 65)

		# Encrypt lowercase characters
		else:
			result += chr((ord(char) + s - 97) % 26 + 97)

	return result

#check the above function
text=raw_input("Enter the text to be encrypted : ")
s = int(raw_input("Enter the shift : "))
print "Text : " + text
print "Shift : " + str(s)
print "Cipher: " + encrypt(text,s)

# OUTPUT:
# python caeser.py 
# Enter the text to be encrypted : hello
# Enter the shift : 3
# Text : hello
# Shift : 3
# Cipher: khoor
