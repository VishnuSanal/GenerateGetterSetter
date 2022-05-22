#!/bin/bash

TYPE=$1
VAR=$2

if [ ! "$VAR" ] || [ ! "$TYPE" ]; then
	echo "----------------------------------------------------------------------------------------------------
-----You can pass command line args in the order VARIABLE_NAME DATA_TYPE to make things quick!------
---------------------Try multiple variables at once by passing them alternately---------------------
--------------------------For eg: java Main String name String value int i--------------------------
----------------------------------------------------------------------------------------------------"

read -p "Enter data type: " TYPE

read -p "Enter variable name: " VAR

fi

#Getter
echo -e "\tpublic $TYPE get${VAR^}(){\n\t\treturn $VAR;\n\t}"

#Setter
echo -e "\tpublic void set${VAR^}($TYPE $VAR){\n\t\tthis.$VAR = $VAR;\n\t}"
