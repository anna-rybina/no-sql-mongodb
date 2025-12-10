# Приложение для работы с MongoDB

Spring Boot приложение с CRUD операциями для коллекции пользователей в MongoDB.

## Технологии
- Java 17
- Spring Boot 4.0.0
- Spring Data MongoDB
- Maven
- Docker

## Функции
- CRUD операции над пользователями
- Поиск по имени и возрасту
- Валидация данных

## Запуск
1. Запустить MongoDB
2. Собрать проект: `mvn clean package`
3. Запустить: `java -jar target/nosql-mongo-0.0.1-SNAPSHOT.jar`

## API
| Метод | URL | Описание |
|-------|-----|----------|
| POST | `/api/users` | Создать |
| GET | `/api/users` | Все |
| GET | `/api/users/{id}` | По ID |
| GET | `/api/users/name/{name}` | По имени |
| GET | `/api/users/age/{age}` | Старше возраста |
| PUT | `/api/users/{id}` | Обновить |
| DELETE | `/api/users/{id}` | Удалить |

## Демо: Spring Boot + MongoDB

Простое приложение, показывающее работу с NoSQL базой данных MongoDB через Spring Boot.

**Что делает:**
- Сохраняет пользователей в MongoDB
- Показывает все базовые операции: создание, чтение, обновление, удаление
- Ищет пользователей по разным критериям

**Зачем нужно:**
- Понять, как работать с NoSQL базами данных
- Научиться использовать Spring Data MongoDB
- Увидеть отличия от реляционных баз данных

**Итог:** Рабочий пример современного backend на Spring с NoSQL хранилищем.