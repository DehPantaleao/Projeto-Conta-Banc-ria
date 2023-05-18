package conta.util;

public class Cores {
	
			//Reset Color
			public static final String TEXT_RESET = "\u001B[0m";

			//Text Color
			public static final String TEXT_BLACK = "\u001B[30m";
			public static final String TEXT_RED = "\u001B[31m";
			public static final String TEXT_GREEN = "\u001B[32m";
			public static final String TEXT_YELLOW = "\u001B[33m";
			public static final String TEXT_BLUE = "\u001B[34m";
			public static final String TEXT_PURPLE = "\u001B[35m";
			public static final String TEXT_CYAN = "\u001B[36m";
			public static final String TEXT_WHITE = "\u001B[37m";

			//Text Color Bold
			public static final String TEXT_BLACK_BOLD = "\033[1;30m";
			public static final String TEXT_RED_BOLD = "\033[1;31m";
			public static final String TEXT_GREEN_BOLD = "\033[1;32m";
			public static final String TEXT_YELLOW_BOLD = "\033[1;33m"; 
			public static final String TEXT_BLUE_BOLD = "\033[1;34m";
			public static final String TEXT_PURPLE_BOLD = "\033[1;35m";
			public static final String TEXT_CYAN_BOLD = "\033[1;36m";
			public static final String TEXT_WHITE_BOLD = "\033[1;37m";

			//Reset Text Underline
			public static final String TEXT_BLACK_UNDERLINED = "\033[4;30m"; 
			public static final String TEXT_RED_UNDERLINED = "\033[4;31m"; 
			public static final String TEXT_GREEN_UNDERLINED = "\033[4;32m"; 
			public static final String TEXT_YELLOW_UNDERLINED = "\033[4;33m"; 
			public static final String TEXT_BLUE_UNDERLINED = "\033[4;34m"; 
			public static final String TEXT_PURPLE_UNDERLINED = "\033[4;35m"; 
			public static final String TEXT_CYAN_UNDERLINED = "\033[4;36m"; 
			public static final String TEXT_WHITE_UNDERLINED = "\033[4;37m"; 
					
			// Text Color High Intensity
			public static final String TEXT_BLACK_BRIGHT = "\033[0;90m";  
			public static final String TEXT_RED_BRIGHT = "\033[0;91m";    
			public static final String TEXT_GREEN_BRIGHT = "\033[0;92m";  
			public static final String TEXT_YELLOW_BRIGHT = "\033[0;93m"; 
			public static final String TEXT_BLUE_BRIGHT = "\033[0;94m";  
			public static final String TEXT_PURPLE_BRIGHT = "\033[0;95m"; 
			public static final String TEXT_CYAN_BRIGHT = "\033[0;96m";   
			public static final String TEXT_WHITE_BRIGHT = "\033[0;97m";  

			// Text Color Bold High Intensity
			public static final String TEXT_BLACK_BOLD_BRIGHT = "\033[1;90m"; 
			public static final String TEXT_RED_BOLD_BRIGHT = "\033[1;91m";   
			public static final String TEXT_GREEN_BOLD_BRIGHT = "\033[1;92m"; 
			public static final String TEXT_YELLOW_BOLD_BRIGHT = "\033[1;93m";
			public static final String TEXT_BLUE_BOLD_BRIGHT = "\033[1;94m";  
			public static final String TEXT_PURPLE_BOLD_BRIGHT = "\033[1;95m";
			public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m";  
			public static final String TEXT_WHITE_BOLD_BRIGHT = "\033[1;97m"; 

			// Background Color
			public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
			public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
			public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
			public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
			public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
			public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
			public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
			public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
					
			// Background Color High Intensity
			public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
			public static final String ANSI_RED_BACKGROUND_BRIGHT = "\033[0;101m";
			public static final String ANSI_GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
			public static final String ANSI_YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
			public static final String ANSI_BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
			public static final String ANSI_PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; 
			public static final String ANSI_CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  
			public static final String ANSI_WHITE_BACKGROUND_BRIGHT = "\033[0;107m";
}

/*
Linha 6: Criamos a variável TEXT_RESET, do tipo final, contendo o código ANSI para resetar as cores do texto e do fundo 
de tela. O nome da variável está em maiúsculo por se tratar de uma constante, ou seja, o valor não pode ser modificado.

Linhas 9 a 16: Criamos as variáveis que contém as 8 cores básicas para serem aplicadas ao texto, do tipo final, contendo 
os respectivos códigos ANSI. O nomes das variáveis estão em maiúsculo por se tratarem de constantes, ou seja, os valores 
não podem ser modificados.

Linhas 19 a 26: Criamos as variáveis que contém as 8 cores básicas com a propriedade negrito (bold) habilitada, para serem 
aplicadas ao texto, do tipo final, contendo os respectivos códigos ANSI. O nomes das variáveis estão em maiúsculo por se 
tratarem de constantes, ou seja, os valores não podem ser modificados.

Linhas 29 a 36: Criamos as variáveis que contém as 8 cores básicas com a propriedade sublinhado (underline) habilitada, 
para serem aplicadas ao texto, do tipo final, contendo os respectivos códigos ANSI. O nomes das variáveis estão em 
maiúsculo por se tratarem de constantes, ou seja, os valores não podem ser modificados.

Linhas 39 a 46: Criamos as variáveis que contém as 8 cores básicas com efeito brilho (cor mais clara) habilitada, 
para serem aplicadas ao texto, do tipo final, contendo os respectivos códigos ANSI. O nomes das variáveis estão em 
maiúsculo por se tratarem de constantes, ou seja, os valores não podem ser modificados. 

Linhas 49 a 56: Criamos as variáveis que contém as 8 cores básicas com efeito brilho (cor mais clara) e a propriedade 
negrito (bold) habilitada, para serem aplicadas ao texto, do tipo final, contendo os respectivos códigos ANSI. 
O nomes das variáveis estão em maiúsculo por se tratarem de constantes, ou seja, os valores não podem ser modificados.

Linhas 59 a 66: Criamos as variáveis que contém as 8 cores básicas para serem aplicadas ao fundo da tela (background), 
do tipo final, contendo os respectivos códigos ANSI. O nomes das variáveis estão em maiúsculo por se tratarem de 
constantes, ou seja, os valores não podem ser modificados.

Linhas 69 a 76: Criamos as variáveis que contém as 8 cores básicas com efeito brilho (cor mais clara) para serem 
aplicadas ao fundo da tela (background), do tipo final, contendo os respectivos códigos ANSI. O nomes das variáveis
 estão em maiúsculo por se tratarem de constantes, ou seja, os valores não podem ser modificados.
*/
