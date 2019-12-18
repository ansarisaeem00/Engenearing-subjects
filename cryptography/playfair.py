keyword=input("Enter the keyword:")
keyword=list(keyword.upper())
alphabet=[]
matrix=[]
for e in range(ord('A'),ord('Z')+1):
	alphabet.append(chr(e))
	
playfair=keyword+alphabet
playfair=sorted(set(playfair), key=playfair.index)
playfair.remove('J')
index=0
for i in range(5):
	matrix.append([])
	for j in range(5):
		matrix[i].append(playfair[index])
		index+=1
print(matrix)
			
