echo "Entrez la valeur du coté A"
read coteA
while [ $coteA -le 0 ] ; do
	echo "Entrez la valeur du coté A, le chiffre doit etre positif, non nul"
	read coteA
done
echo "Entrez la valeur du coté B"
read coteB

while [ $coteB -le 0 ] ; do
	echo "Entrez la valeur du coté B, le chiffre doit etre positif, non nul"
	read coteB
done

echo "Entrez la valeur du coté C"
read coteC

while [ $coteC -le 0 ] ; do
	echo "Entrez la valeur du coté C, le chiffre doit etre positif, non nul"
	read coteC
done


if [ $coteA -eq $coteB -a $coteC -eq $coteB ]
	then echo " votre triangle est équilatéral"
	
	else if [ $coteA -eq $coteB -o $coteA -eq $coteC -o $coteC -eq $coteB ]
		then echo "votre triangle est isocèle"
	
		else 
		echo "votre triangle est scalène"
	fi
	
	
	
	
fi

