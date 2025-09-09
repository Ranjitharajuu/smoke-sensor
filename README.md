Smoke sensor -Detailed view:
->Arduino open-source electronics platform based on easy-to-use hardware and software.
->Arduino boards can read digital & analog inputs from the sensors.
->The MQ2 smoke sensor is sensitive to smoke gases like LPG, Butane, Propane, Methane, Alcohol, Hydrogen.
->When the MQ2 Gas Sensor will detect the smoke level high, the red led will glow and the buzzer will start.
Components Required:
➤Arduino uno, Smoke Detector Sensor, buzzer sound alarm
The functions allow a programmer to divide a specific code into various sections, and each section performs a particular task.
➤Smoke Detector Sensor
Smoke alarms detect fires by sensing small particles in the air.
➤Buzzer sound alarm
Buzzer meaning electronic component that generates sound through the transmission of electrical signals.
➤Jumper Wires
Jumper wires are electrical wires with connector pins at each end They are used to connect two points in a circuit without soldering.


Algorithm -
Start
            |
    Initialize Constants
            |
         Setup:
        /   |   \
pinMode   pinMode  Serial.begin
(SENSOR_PIN,    (BUZZER_PIN,  9600)
  INPUT)       OUTPUT)
            |
        Main Loop:
            |
     Read sensorValue
    from SENSOR_PIN
            |
    Print "Sensor Value:"
     and sensorValue
            |
   Is sensorValue > THRESHOLD?
          /    \
       Yes     No
       |       |
Print "Smoke  Print "No
 Detected!"  smoke detected."
       |       |
 digitalWrite  digitalWrite
 (BUZZER_PIN,  (BUZZER_PIN,
    HIGH)       LOW)
       |       |
   delay(1000) delay(1000)
       |
 digitalWrite
 (BUZZER_PIN,
   LOW)
       |
  delay(1000)
       |
     Repeat




