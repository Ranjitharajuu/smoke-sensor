#define SENSOR_PIN A0
#define BUZZER_PIN 8
#define THRESHOLD 200
void setup(){
  pinMode(SENSOR_PIN, INPUT);
  pinMode(BUZZER_PIN, OUTPUT);
  Serial.begin(9600);
}
void loop(){
  int sensorValue=analogRead(SENSOR_PIN);
  Serial.print("Sensor Value:");
  Serial.println(sensorValue);
  if (sensorValue>THRESHOLD){
    Serial.println("Smoke Detected!");
    digitalWrite(BUZZER_PIN,HIGH);
    delay(1000);
    digitalWrite(BUZZER_PIN,LOW);
    delay(1000); 
  }
  else{
    Serial.println("No smoke detected.");
    digitalWrite(BUZZER_PIN,LOW);
    delay(1000);
  }
}
