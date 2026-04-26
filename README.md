# Java RPG

A text-based role-playing game (RPG) implemented in Java. This project is designed to demonstrate fundamental concepts in object-oriented programming, data structures, and game logic using Java.

## Features

- Turn-based combat system
- Character creation and progression
- Inventory and equipment management
- Non-player characters (NPCs) and interactive dialogues
- Quests and storyline progression
- Save and load game functionality

## Requirements

- Java 11 or higher
- Gradle or Maven for build automation (see setup section)

## Getting Started

Clone this repository:
```sh
git clone https://github.com/tjatoba/java-rpg.git
cd java-rpg
```

### Build and Run

#### Using Gradle

```sh
./gradlew build
./gradlew run
```

#### Using Maven

```sh
mvn compile
mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
```

Update the `mainClass` argument above to match your project's main class/package.

## Usage

Once started, the game will prompt you with options to create a character and begin your adventure.

Follow on-screen instructions to navigate through the game and interact with various features.

## Project Structure

- `src/` — Java source code
- `resources/` — Game data and assets
- `docs/` — Additional documentation

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or feature requests.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Roadmap

- [ ] Implement graphical user interface (GUI)
- [ ] Add more enemy types and bosses
- [ ] Expand world map and questlines

## Contact

For questions, feedback, or contributions, please open an issue on GitHub.
