# Lumina

A Java-based idle tycoon game featuring object-oriented programming, magic garden themes, custom dialogs, and elemental world exploration.

## Features
- **Idle Tycoon Gameplay:** Grow plants, manage resources, and progress automatically.
- **Elemental Worlds:** Explore multiple unique maps (Earth, Fire, Water, Wind, etc.).
- **Object-Oriented Design:** Clean, modular structure utilizing custom game states and managers.
- **Save/Load System:** Multi-slot data saving stored safely in the user's local directory.

## Project Structure
- `src/core/`: Main game loop and window management (`Main`, `GamePanel`).
- `src/state/`: Game states handling menu, gameplay, story, character selection, and save/load UI.
- `src/map/`: Elemental areas and map logic.
- `src/entity/`: Game objects like plants.
- `src/data/`: Save system architecture (`SaveManager`, `SaveData`).
- `res/`: Game assets including backgrounds, maps, and plant sprites.

## How to Run
1. Ensure you have **Java JDK** installed.
2. Clone or download the repository.
3. Open the project in your favorite Java IDE (Eclipse, IntelliJ IDEA, VS Code).
4. Run `src/core/Main.java`.