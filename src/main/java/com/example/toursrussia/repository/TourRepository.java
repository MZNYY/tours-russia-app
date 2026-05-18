package com.example.toursrussia.repository;

import com.example.toursrussia.model.Tour;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TourRepository {
    private static TourRepository instance;
    private List<Tour> tours;

    private TourRepository() {
        tours = new ArrayList<>();
        initializeTours();
    }

    public static synchronized TourRepository getInstance() {
        if (instance == null) {
            instance = new TourRepository();
        }
        return instance;
    }

    private void initializeTours() {
        Tour tour1 = new Tour(1, "Золотое кольцо России", "Центральная Россия",
                "Путешествие по древним городам с традиционной архитектурой",
                "Посетите Владимир, Суздаль, Ростов-Ярославский и Ярославль. Увидите деревянные церкви, древние монастыри и традиционные русские ремёсла.",
                12500, 4, 4.8, 245, "https://via.placeholder.com/500x300?text=Golden+Ring");
        tour1.addAttraction("Успенский собор во Владимире");
        tour1.addAttraction("Суздальский кремль");
        tour1.addAttraction("Музей деревянного зодчества");
        tour1.addHighlight("Традиционные русские деревни");
        tour1.addHighlight("Древние монастыри");
        tour1.setDifficulty("Easy");
        tours.add(tour1);

        Tour tour2 = new Tour(2, "Озеро Байкал", "Сибирь",
                "Самое глубокое озеро в мире с кристально чистой водой",
                "Авто и пешие экскурсии вокруг озера. Посмотрите на Листвянку, остров Ольхон, и сокотокен. Идеально для активного отдыха и рыбалки.",
                18900, 5, 4.9, 312, "https://via.placeholder.com/500x300?text=Lake+Baikal");
        tour2.addAttraction("Остров Ольхон");
        tour2.addAttraction("Листвянка");
        tour2.addAttraction("Музей Байкала");
        tour2.addHighlight("Самое чистое озеро");
        tour2.addHighlight("Уникальная природа");
        tour2.setDifficulty("Hard");
        tours.add(tour2);

        Tour tour3 = new Tour(3, "Алтайские горы", "Сибирь",
                "Величественные горные пейзажи и нетронутая дикая природа",
                "Альпийские луга, ледники, озёра горных вершин. Идеально для пешего туризма, скалолазания и фотографирования природы.",
                16200, 6, 4.7, 198, "https://via.placeholder.com/500x300?text=Altai+Mountains");
        tour3.addAttraction("Гора Белуха");
        tour3.addAttraction("Озеро Телецкое");
        tour3.addAttraction("Водопады Чулышмана");
        tour3.addHighlight("Альпийские ландшафты");
        tour3.addHighlight("Нетронутая природа");
        tour3.setDifficulty("Hard");
        tours.add(tour3);

        Tour tour4 = new Tour(4, "Камчатка", "Дальний Восток",
                "Земля вулканов, гейзеров и диких медведей",
                "Посетите Долину гейзеров, вулканы Авачинский и Корякский, горячие источники. Наблюдайте за дикой природой и рыбалкой на лосось.",
                45000, 8, 4.9, 156, "https://via.placeholder.com/500x300?text=Kamchatka");
        tour4.addAttraction("Долина гейзеров");
        tour4.addAttraction("Вулканы");
        tour4.addAttraction("Горячие источники");
        tour4.addHighlight("Вулканическая активность");
        tour4.addHighlight("Дикие медведи");
        tour4.setDifficulty("Hard");
        tours.add(tour4);

        Tour tour5 = new Tour(5, "Кавказские горы", "Южная Россия",
                "Горный край с горячими источниками и разнообразной культурой",
                "Эльбрус - самая высокая вершина России. Горнолыжные курорты, альпинизм, пешие маршруты. Культурное разнообразие и гостеприимство.",
                14500, 5, 4.6, 287, "https://via.placeholder.com/500x300?text=Caucasus+Mountains");
        tour5.addAttraction("Гора Эльбрус");
        tour5.addAttraction("Архыз");
        tour5.addAttraction("Домбай");
        tour5.addHighlight("Самая высокая гора России");
        tour5.addHighlight("Горнолыжные курорты");
        tour5.setDifficulty("Medium");
        tours.add(tour5);

        Tour tour6 = new Tour(6, "Крым", "Юг России",
                "Жемчужина Чёрного моря с пляжами и древними городами",
                "Ялта, Симеиз, Севастополь. Пляжи, морские экскурсии, горные маршруты, исторические памятники. Идеально для летнего отдыха.",
                13800, 4, 4.5, 423, "https://via.placeholder.com/500x300?text=Crimea");
        tour6.addAttraction("Ялта");
        tour6.addAttraction("Ласточкино гнездо");
        tour6.addAttraction("Севастополь");
        tour6.addHighlight("Пляжи Чёрного моря");
        tour6.addHighlight("Древние города");
        tour6.setDifficulty("Easy");
        tours.add(tour6);

        Tour tour7 = new Tour(7, "Санкт-Петербург", "Северо-Западная Россия",
                "Северная Венеция с великолепными дворцами и музеями",
                "Эрмитаж, Зимний дворец, Петергоф, Пушкин. Каналы, мосты, архитектура XVIII-XIX веков. Ночная жизнь и культурные события.",
                9500, 3, 4.8, 567, "https://via.placeholder.com/500x300?text=St+Petersburg");
        tour7.addAttraction("Эрмитаж");
        tour7.addAttraction("Зимний дворец");
        tour7.addAttraction("Петергоф");
        tour7.addHighlight("Великолепные дворцы");
        tour7.addHighlight("Мировые музеи");
        tour7.setDifficulty("Easy");
        tours.add(tour7);

        Tour tour8 = new Tour(8, "Казань", "Поволжье",
                "Столица Татарстана - город на перекрёстке культур",
                "Казанский кремль, мечеть Кул-Шариф, храм всех религий. Национальная кухня, традиционные ремёсла, спортивные сооружения олимпиады 2013.",
                7200, 2, 4.4, 301, "https://via.placeholder.com/500x300?text=Kazan");
        tour8.addAttraction("Казанский кремль");
        tour8.addAttraction("Мечеть Кул-Шариф");
        tour8.addAttraction("Озеро Кабан");
        tour8.addHighlight("Культурное разнообразие");
        tour8.addHighlight("Национальная татарская культура");
        tour8.setDifficulty("Easy");
        tours.add(tour8);

        Tour tour9 = new Tour(9, "Волга круиз", "Центральная Россия",
                "Путешествие по матери русских рек на борту круизного судна",
                "Москва, Углич, Мышкин, Ярославль, Кострома, Чебоксары, Казань, Волгоград. Роскошные каюты, развлечения, рестораны на борту.",
                22500, 7, 4.7, 189, "https://via.placeholder.com/500x300?text=Volga+Cruise");
        tour9.addAttraction("Москва");
        tour9.addAttraction("Углич");
        tour9.addAttraction("Казань");
        tour9.addHighlight("Речной круиз");
        tour9.addHighlight("Полный комфорт");
        tour9.setDifficulty("Easy");
        tours.add(tour9);

        Tour tour10 = new Tour(10, "Русский Север", "Северная Россия",
                "Древние города с деревянной архитектурой и северной природой",
                "Архангельск, Соловецкие острова, Кижи, Валаам. Деревянные монастыри, озёра, северное сияние в зимний сезон. Аутентичная русская культура.",
                15800, 5, 4.6, 234, "https://via.placeholder.com/500x300?text=Russian+North");
        tour10.addAttraction("Соловецкие острова");
        tour10.addAttraction("Остров Кижи");
        tour10.addAttraction("Валаам");
        tour10.addHighlight("Древние деревянные монастыри");
        tour10.addHighlight("Северное сияние");
        tour10.setDifficulty("Medium");
        tours.add(tour10);
    }

    public List<Tour> getAllTours() {
        return new ArrayList<>(tours);
    }

    public Tour getTourById(int id) {
        for (Tour tour : tours) {
            if (tour.getId() == id) {
                return tour;
            }
        }
        return null;
    }

    public List<Tour> searchTours(String query) {
        String lowerQuery = query.toLowerCase();
        return tours.stream()
                .filter(tour -> tour.getName().toLowerCase().contains(lowerQuery) ||
                        tour.getDescription().toLowerCase().contains(lowerQuery) ||
                        tour.getRegion().toLowerCase().contains(lowerQuery))
                .collect(Collectors.toList());
    }

    public List<Tour> filterByRegion(String region) {
        return tours.stream()
                .filter(tour -> tour.getRegion().equalsIgnoreCase(region))
                .collect(Collectors.toList());
    }

    public List<Tour> filterByPriceRange(double minPrice, double maxPrice) {
        return tours.stream()
                .filter(tour -> tour.getPrice() >= minPrice && tour.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Tour> filterByDifficulty(String difficulty) {
        return tours.stream()
                .filter(tour -> tour.getDifficulty().equalsIgnoreCase(difficulty))
                .collect(Collectors.toList());
    }
}
