# Zadanie 6 - Spring Boot - kontroler, endpoint
#### Zakres: Spring Web, kontroler, endpoint, adnotacje, Dependency Injection

### Zadanie "Domowa biblioteczka" :books:

1. Na potrzeby zadania jest już przygotowany zbiór książek (com.isa.bookcase.repository.Books).
2. Utwórz kontroler Bookcase z endpointem /books który wyświetli wszystkie książki z repozytorium na jedynym widoku:
* każda pozycja na liście powinna wyświetlać wszystkie dostępne informacje o danej książce.
* format wyświetlenia danych do wyboru: zwykły tekst, prosty html, json.
3. Dodaj kontroler RandomBook:
* endpoint /book-for-today powinien wyświetlić losową książkę z repozytorium.
4. Dodaj kolejny kontroler FindBook z endpointem /book/{title}/search:
* zaimplementuj wyszukiwanie książki po zadanym w request parametrze title,
* jeśli jako wartość parametru title została podana np. tylko litera "a", powinny się wyświetlić wszystkie książki zawierające w tytule literę "a" lub "A",
5. Do rozwiązania możesz wykorzystać klasy z pakietu domain i repository.
6. Twoja aplikacja powinna być zbudowana w oparciu o poznane na warsztatach mechanizmy Dependency Injection i Inversion of Control.
## Wymagania i punktacja:
* Aplikacja powinna być napisana obiektowo i z wykorzystaniem mechanizmów Springa - 1 pkt.
* Prawidłowo działający endpoint /books - 1 pkt.
* Prawidłowo działający endpoint /book-for-today - 1 pkt.
* Prawidłowo działający endpoint /book/{title}/search - 2 pkt.
* Maksymalną ilość punktów za zadanie (5 pkt.) można otrzymać tylko wówczas, jeśli wszystkie powyższe polecenia zostały wykonane prawidłowo.


## Forma oddania zadania
Utwórz branch o nazwie wg konwencji `6_imieNazwisko`, np. `6_MariuszSzymanski`  
:exclamation: Pamiętaj, aby nowy branch, utworzyć wychodząc z aktualnego brancha `main`.
Wykonaj zadanie na podanym branchu.  
Utwórz Pull Request ze swojego brancha na branch main.  
Dopiero tak zgłoszone zadanie podlega ocenie.


## Punktacja

Do zdobycia jest :five:  pkt.  
Zadania oddane po terminie są oceniane na maksymalnie połowę punktów.

#### Powodzenia!

### :clock12: Termin oddania:
## Niedziela, 05.12.2021
