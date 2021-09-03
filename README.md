# Entity Model JSON Example Mod
This is an example mod demonstrating how to use [Entity Model JSON](https://github.com/SizableShrimp/EntityModelJson).
It adds a dummy entity to the game that has an armor stand model defined in JSON, but uses the squid texture.

Notable places to check out are:
* [An example entity renderer](src/main/java/me/sizableshrimp/entitymodeljsonexample/ExampleAnimalRenderer.java) - Demonstrates the model with its `ModelLayerLocation` and how to determine what file it points to
* [An example entity model datagen provider](src/main/java/me/sizableshrimp/entitymodeljsonexample/ExampleEntityModelProvider.java) - Demonstrates how to generate JSON entity models through data generation
* [An entity model JSON file](src/main/resources/assets/entitymodeljsonexample/models/entity/main/example_animal.json) - Contains the armor stand entity model defined in JSON
* [The mod dependency in mods.toml](src/main/resources/META-INF/mods.toml#L51-L57) - Demonstrates how to declare a required dependency on the Entity Model JSON mod
* [The Gradle repository](build.gradle#L147-L150) and [Gradle dependency](build.gradle#L159-L160) - Demonstrates how to get the mod at runtime for development testing