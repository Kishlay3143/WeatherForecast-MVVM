# WeatherForecast-MVVM
Overview
The Weather Forecast Android App is a simple yet powerful weather application that provides users with up-to-date weather information for their current location or any
location they choose. This app is built using the MVVM (Model-View-ViewModel) architecture and written in Kotlin. It leverages the OpenWeather API to fetch weather 
data and presents it to users in a user-friendly and intuitive interface.

- Features
Current Weather: Get real-time weather information for your current location, including temperature, humidity, wind speed, and conditions.
Weather Forecast: View a 7-day weather forecast to plan your week ahead. This forecast includes daily temperature highs and lows, as well as a brief description of 
the weather conditions.
Search by Location: Enter any location to get weather information for that area. The app supports searching for cities worldwide.
Location-Based Data: The app automatically detects your current location and provides weather data for that location by default.

* Screenshots
- Image1
![Screenshot (4419)](https://github.com/Kishlay3143/WeatherForecast-MVVM/assets/92507922/d4a3fa21-ab6f-454c-a592-fe3d762e3674)

- Image2
  ![Screenshot (6412)](https://github.com/Kishlay3143/WeatherForecast-MVVM/assets/92507922/f017e092-1954-43dc-9173-19d27cfe7274)

* Installation
1. Clone or download this repository.
>> git clone https://github.com/yourusername/weather-forecast-app.git
2.Open the project in Android Studio.
3.Build and run the app on your Android device or emulator.

*Configuration
To make this app work, you need to obtain an API key from OpenWeather. Follow these steps:
1. Visit the OpenWeather website.
2. Sign up for a free or paid account, and then log in.\
3. Once logged in, go to the "API Keys" section in your account dashboard.
4. Create a new API key if you haven't already.
5. Open the local.properties file in your Android project and add your API key like this:
>>openweather_api_key=YOUR_API_KEY_HERE

*Libraries Used
This app makes use of several third-party libraries and tools:
1. Retrofit: A type-safe HTTP client for making API calls.
2. Glide: A fast and efficient image loading library.
3. ViewModel: Part of Android Architecture Components, it helps manage UI-related data.
4. LiveData: Also part of Android Architecture Components, it provides observable data.
5. Data Binding: A library that allows you to bind UI components in layouts to data sources.

*Contributors
Kishlay Raj

*Acknowledgments
Thanks to the OpenWeather team for providing the weather data and API.
Special thanks to the Android community and the creators of the libraries used in this project for making Android app development more efficient and enjoyable.

* Support or Contact
If you have any questions or need assistance with this project, please feel free to contact us at masterkishlay@gmail.com
We welcome contributions and bug reports! Please submit an issue or create a pull request to help improve this app.
