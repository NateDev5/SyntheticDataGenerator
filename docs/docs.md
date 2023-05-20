# Table of content
- Basics
    - [Symbols](#symbols)
    - [Variables](#variables)
    - [Functions](#functions)
        - [Utils](#utils)
        - [Interfaces](#interfaces)
        - [Mutators](#mutators)
        - [Generation](#generation)
    - [Template Creation](#template)
    - [Script basics]()
- Command line

# **Basics**

## **Symbols**
"```->```" This is used to declare or assign a variable.

"```"```" This is used to create a string.

"```;```" This is used to end a line. Every end of line should have one.
<a name="symbols"></a>

## **Variables**
### **Basics**
Variables are declared as so :
```js
<VariableType> <Identifier> -> <Value>;
```

### **Interface**
A structure/template that holds data. They are used to tell the script how your data will be generated
```js
interface example -> CREATE_INTERFACE("Example", "./example.json");
```

### **Boolean**
A simple true or false condition
```js
bool example -> true;
```

### **Integer**
A full number
```js
int example -> 10;
```

### **Float**
A decimal number
```js
float example -> 3.141592653;
```

### **Array**
A list of values
```js
array example -> [1,2,3,4,5];
```

### **String**
A string of text
```js
string example -> "This is an example string!";
```

### **Path**
A path to a file
```js
path example -> "D:/a/b/c/example.file";
```

### **Json file**
A path to a json file
```js
jsonfile example -> "D:/a/b/c/example.json";
```

### **Mutator**
Used to create a mutator which are generally used to mutate values when generating an element based on 2 parents. [Read here](#mutators)
```js
mutator example -> CREATE_MUTATOR("example.exampleAttribute");
```

<a name="variables"></a>

# **Functions**

## **Utils**
#### **Require plugin**
Require a plugin. This function should be at the start of the file
```js
REQUIRE_PLUGIN (<InterfaceName>)
```
Example :
```js
REQUIRE_PLUGIN("faker")
```

## **Interfaces**
Functions that are used to generate templates that are the foundation used to generate the data
#### **Create interface**
```js
CREATE_INTERFACE (<InterfaceName>, <JsonFile>/<JsonFileString>)
```
Example 1 :
```js
jsonfile exampleTemplate -> "D:/a/b/c/example.json";
interface example1 -> CREATE_INTERFACE ("ExampleInterface", exampleTemplate);
```
Example 2 :
```js
interface example2 -> CREATE_INTERFACE ("ExampleInterface", "D:/a/b/c/example.json");
```

## **Mutators**
Functions that are used to generate mutators which are used to mutate certain attributes based on 2 parents.

They are 3 types of mutators
- Basic mutator (```CREATE_MUTATOR```)
- Weighted mutator: Used for altering enums (```CREATE_WEIGHTED_MUTATOR```)
- Range mutator: Used for altering floats (```CREATE_RANGE_MUTATOR```)

---
#### **Basic mutator**
```js
CREATE_MUTATOR (<AttributePath>);
```
Example :
```js
mutator example -> CREATE_MUTATOR ("example.attribute");
```

---

#### **Weighted mutator**
It will choose between the option of the first parent and the second parent based on the threshold
```js
CREATE_WEIGHTED_MUTATOR (<AttributePath>, <Threshold>);
```
Example 1 :
```js
mutator example1 -> CREATE_WEIGHTED_MUTATOR ("example.attribute", 0.5);
```

Example 2 :
```js
float threshold -> 0.5;
mutator example2 -> CREATE_WEIGHTED_MUTATOR ("example.attribute", threshold);
```

---

#### **Range mutator**
It will generate a random float between the first parent attribute and the second parent attribute
```js
CREATE_RANGE_MUTATOR (<AttributePath>);
```
```SET_DEFAULT``` needs to be used before or after the declaration of the mutator in order to set the default range that the inital parents will choose from.

Example 1 :
```js
mutator example -> CREATE_RANGE_MUTATOR ("example.attribute");
```

Example 2 :
```js
SET_DEFAULT("example.attribute", [5.0, 6.5])
mutator example -> CREATE_RANGE_MUTATOR ("example.attribute");
```

---

#### **Set default**
Set default sets the base values that the couples (2 parents) will have

Required if you are using any kind of mutator
```js
SET_DEFAULT (<AttributePath>, <ArrayOfValues>);
```
Example :
```js
SET_DEFAULT("example.attribute1", [0.5])
SET_DEFAULT("example.attribute2", ["Option1", "Option2"])
SET_DEFAULT("example.attribute3", [5.0, 6.5])

mutator mutator1 -> CREATE_MUTATOR ("example.attribute1");
mutator mutator2 -> CREATE_WEIGHTED_MUTATOR ("example.attribute2", 0.5);
mutator mutator3 -> CREATE_RANGE_MUTATOR ("example.attribute3");
```

---

## **Generation**
These functions are the starting point of your generator and one of them is required for the script to run.

**IMPORTANT**: These functions should always be at the complete bottom of your file

They are 2 types of generation methods :
- Basic generation ```GENERATE```
- Generation with mutators ```GENERATE_WITH_MUTATORS```

---

#### **Generate**
The basic generation method. It generates values in your templates randomly
```js
GENERATE (<Interface>/<TemplateName>, <NumberOfElements>);
```
Example 1 :
```js
interface template -> GENERATE_INTERFACE ("Example", "D:/a/b/c/example.json");
GENERATE (template, 10);
```

Example 2 :
```js
interface template -> GENERATE_INTERFACE ("Example", "D:/a/b/c/example.json");
GENERATE ("Example", 10);
```

---

#### **Generate with mutators**
The generation method that generate a number of starting couple (2 parents) and then a number of children is generated based on the provided mutators
```js
GENERATE_WITH_MUTATORS (<Interface>/<TemplateName>, <ArrayOfMutators>, <NumberOfCouple>, <NumberOfChildren>, <NumberOfSteps>);
```
Example :
```js
interface template -> GENERATE_INTERFACE ("Example", "D:/a/b/c/example.json");
mutator testMutator1 -> CREATE_MUTATOR ("Example.attribute1");
mutator testMutator2 -> CREATE_RANGE_MUTATOR ("Example.attribute2");
mutator testMutator3 -> CREATE_WEIGHTED_MUTATOR ("Example.attribute3");
GENERATE_WITH_MUTATORS (template, [testMutator1, testMutator2, testMutator3], 2, 2, 5);
```

<a name="functions"></a>


# **Template creation**
### A template is basically a json file with a certain type of structure that will be transpiled when the script will be built.

### For your generator to work correctly you need to use the provided varaibles types and structure.

## **Variables**
- Enums : 
```json
{
    "Example_enum": "enum(Option1,Option2,Option3)"
}
```
- Floats : 
```json
{
    "Example_float": "float"
}
```
- Integers : 
```json
{
    "Example_int": "int"
}
```
- Strings : 
```json
{
    "Example_string": "string"
}
```

## **Examples**
### Here is an example template for a person :
```json
{
    "FirstName": "string",
    "LastName": "string",
    "Age": "int",
    "Sex": "enum(Male,Female)",
    "PhoneNumber": "string",
    "EyeColor": "enum(Blue,Green,Brown,Hazel)",
    "Height": "float"
}
```

<a name="template"></a>

# **Script basics**
### Your script should always end with ```.ds``` if it dosent it will not be built

## **Basic structure**
```py
# Require your plugins
REQUIRE_PLUGIN ("Plugin Name")

# The logic of your code setting up your templates, mutators, etc...

# The generation method always at the end of the file
GENERATE ("Example", 10)
```

<a name="script"></a>

### **Script Example**
- ```Person.json```:
```json
{
    "FirstName": "string",
    "LastName": "string",
    "Age": "int",
    "Sex": "enum(Male,Female)",
    "PhoneNumber": "string",
    "EyeColor": "enum(Blue,Green,Brown,Hazel)",
    "Height": "float"
}
```

- ```person_generator.ds```:
```py
# importing a plugin for example "faker" which is useful for generating a bunch of data
REQUIRE_PLUGIN("faker");

# Creating a variable for storing the base json template
jsonfile Person_jsonFile -> "D:\YOUR_DIRECTORY\Person.json";

# Setting the default person height between 5ft and 6.5ft
SET_DEFAULT ("Person.Height", [5.0, 6.5])

# Creating the template 
interface Person -> CREATE_INTERFACE ("Person", Person_jsonFile);


# Creating a mutator to mutate the eye color based on the parents
float threshold -> 0.5;
mutator eyeColor -> CREATE_WEIGHTED_MUTATOR("Person.EyeColor", threshold);

# Creating a mutator to mutate the height between both parents height
mutator height -> CREATE_RANGE_MUTATOR("Person.Height");

# Generating the template based on both mutators and setting the number of couple to 2, number of children to 2 and number of steps to 4
GENERATE_WITH_MUTATORS ("Person", [eyeColor,height], 2, 2, 4);
# The output will be 2 couple of 2 parents, 2 children each and redo the generation for each number of children couple which in this case is : 4 times
```