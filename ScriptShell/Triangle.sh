echo "Entrez la valeur du coté A"
read coteA

echo "Entrez la valeur du coté B"
read coteB

echo "Entrez la valeur du coté C"
read coteC

if [ $coteA -eq $coteB -a $coteC -eq $coteB ]
	then echo " votre triangle est équilatéral"
	
	else if [ $coteA -eq $coteB -o $coteA -eq $coteC -o $coteC -eq $coteB ]
		then echo "votre triangle est isocèle"
	
		else 
		echo "votre triangle est scalène"
	fi
	
	
	
	
fi
