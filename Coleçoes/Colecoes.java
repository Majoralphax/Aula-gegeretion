package POO;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//import java.util.*;

public class Colecoes {
	public static void main(String args[])
	{
	List<Integer> minhaLista = new ArrayList<Integer>();//cria um list do tipo arraylist
	
	minhaLista.add(2);//adiciona elementos no arraylist
	minhaLista.add(1);
	minhaLista.add(2);
	minhaLista.add(3);
	minhaLista.add(1);
	
	for(Integer listaElementos:minhaLista)//percorre toda a lista de elementos
	{
		System.out.println(listaElementos);
	}
	
	int primeiroElemento = minhaLista.get(0);//pega uma posição do arraylist
	System.out.println("O primeiro elemento é: "+primeiroElemento);
	System.out.println();
	for(int i=0;i<minhaLista.size();i++)
	{
		System.out.println("Elemento: "+minhaLista.get(i));//imprime as posições através do indice
	}
	
	Collections.sort(minhaLista);//serve para ordenar o meu arraylist
	System.out.println("Lista depois de ordenada...");
	System.out.println(minhaLista);
	System.out.println();
	
	Set<Integer> meuSet = new HashSet<Integer>();//cria um hashset chamado meuSet
	
	meuSet.add(2);//adiciona elementos para o meuSet
	meuSet.add(1);
	meuSet.add(3);
	meuSet.add(1);
	meuSet.add(2);
	
	Iterator<Integer> imeuSet = meuSet.iterator();//cria um Iterator para ordenar e não repete elementos
	
	while(imeuSet.hasNext())//procura por posição e retorna TRUE caso encontre algum elemento na posição, caso contrário retorna FALSE
	{
		System.out.println(imeuSet.next());//imprime o próximo elemento
	}

	
}
}

