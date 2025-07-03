# 📚 TrackMyMedia

TrackMyMedia is a simple Java-based console application to **track your progress** in various types of media — including **TV shows, anime, books**, and more.

You can keep track of:
- 🎬 Episode and season numbers (for shows/anime)
- 📖 Page numbers (for books)
- ➕ Add, update, or remove entries
- 💾 Save/load progress between sessions (stored locally)

Everything is stored using **Java object serialization** — no need for a database or external dependencies.

---

## 🚀 Features

- 📺 Track series, anime, or any episodic content  
- 📘 Track reading progress for books  
- ✏️ Add new media entries and update progress  
- 🧹 Clean and minimal CLI interface  
- 🔒 Data persists using serialized `.ser` file

---

## 🛠️ Tech Stack

- Java 17+
- Maven (for building and managing dependencies)
- Object Serialization for persistent local storage

---

## 🔧 Setup & Usage

### ✅ Requirements

- Java (JDK 17 or newer)
- Maven

### 📦 Clone and Build

```bash
git clone https://github.com/NiteshSangroula/TrackMyMedia.git
cd TrackMyMedia
mvn clean package
```
This creates a .jar file in the target/ directory.
🚀 Run the Application

Move the .jar file somewhere convenient and run it:

```bash
mv target/TrackMyMedia-1.0-SNAPSHOT.jar ~/Desktop/
cd ~/Desktop/
java -jar TrackMyMedia-1.0-SNAPSHOT.jar
```
You can place it anywhere that’s easy to access and launch from.
💾 Data Storage Location

Your media progress is saved in a file located at:

```bash
~/TrackMyMedia/mediaitems.ser
```

Make sure not to delete this file if you want to preserve your progress.

📝 License

This project is licensed under the MIT License.

🤝 Contributions

Pull requests are welcome!
Ideas like supporting games, podcasts, or GUI improvements are always appreciated.


✍️ Author

Made with ❤️ by Nitesh Sangroula

