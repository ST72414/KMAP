# KMAPaplication

Android aplikace vytvořená jako semestrální projekt pro předmět KMAP.

## Popis projektu

Hra na hádání čísel s prvky učení a logiky. Uživatel hádá číslo podle zobrazené nápovědy (např. "Počet kol u auta") a aplikace mu ukazuje, zda byl tip správný či špatný.

## Použité technologie

- **Programovací jazyk**: Kotlin
- **Architektura**: MVVM
- **Knihovny**:
  - Room databáze pro ukládání výsledků
  - RecyclerView pro zobrazení historie tipů
  - ViewModel & LiveData pro práci se stavem aplikace

## Funkcionalita

- Vygeneruje se náhodná nápověda (např. "Počet smyslů člověka")
- Uživatel zadá číslo 1–10
- Zobrazí se, zda byl tip správný nebo špatný
- Historie tipů je zobrazena v seznamu
- Každý záznam je barevně odlišen podle úspěšnosti (zelená/červená)
- Počet pokusů je omezen na 10 a zobrazuje se jako `5/10`
- Data jsou uložena v databázi Room

## Struktura projektu
com.example.kmapaplication
├── model
│ ├── GameResult.kt // Entity pro výsledek
│ ├── GameResultDao.kt // DAO pro přístup k DB
│ ├── AppDatabase.kt // Room databáze
│ └── Hint.kt // Třída pro nápovědy
├── ui
│ ├── MainActivity.kt // Aktivita s UI logikou
│ ├── GameViewModel.kt // ViewModel
│ └── GameAdapter.kt // RecyclerView adapter

## Uložené commity (ukázky)

- `Inicializace projektu s hlavní aktivitou a layoutem`
- `MVVM struktura - ViewModel a Hint`
- `Zobrazení RecyclerView se seznamem výsledků`
- `Barevné odlišení správných/špatných tipů`
- `Implementace Room databáze pro ukládání výsledků`
- `Zobrazení počtu pokusů jako 5/10`

## Autorka
Projekt jsem vytvořila sama.

Repozitář: (https://github.com/ST72414/KMAP)

