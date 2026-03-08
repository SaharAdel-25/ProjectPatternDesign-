
 Calculator Design Patterns Project
في مشروع مادة Design Patterns حولنا آلة حاسبة بسيطة إلى نموذج منظم ومرن. بدأنا بكود كله في كلاس واحد، ثم قمنا بإعادة هيكلة الوظائف باستخدام الأنماط الثلاثة: Creational، Structural، وBehavioral، لتصبح الوظائف واضحة وسهلة التوسيع والصيانة.

خلال المشروع طبقنا عدة Patterns مهمة:

Singleton: لضمان وجود نسخة واحدة فقط من واجهة الحاسبة طوال تشغيل البرنامج.

Factory Method: لإنشاء كائنات العمليات الحسابية بناءً على مدخلات المستخدم دون تعقيد الكود الرئيسي.

Memento: لحفظ واسترجاع حالة الآلة الحاسبة (History) بسهولة.

Adapter: لربط مكتبات حسابية خارجية (Advanced Math) مع نظامنا الحالي دون تعديل الكود القديم.

Strategy: لتغيير خوارزمية العمليات الحسابية أثناء التشغيل بمرونة عالية.

Decorator: لإضافة ميزات إضافية للكائن (مثل السمات) دون الحاجة لتغيير الكلاس الأصلي.

--------------------------------------------------------------------------------------------------------------------------------------------------------


In my Design Patterns course project, we transformed a simple calculator from a single cluttered class into a clear and flexible design using Creational, Structural, and Behavioral patterns to make the code scalable and maintainable.

During the project, we applied several key Patterns:

Singleton: To ensure only one instance of the calculator UI exists.

Factory Method: To create operation objects based on user input without complicating the main code.

Memento: To easily save and restore the calculator's state (History).

Adapter: To bridge external math libraries with our current system without modifying old code.

Strategy: To switch calculation algorithms at runtime with high flexibility.

Decorator: To add extra features (like themes) without changing the original class.


Project Progress (UML & UI)
![uml_before](https://github.com/user-attachments/assets/a86a101b-6c2b-4da9-a54b-a354b7d4de18)
<img width="2660" height="2069" alt="uml_after" src="https://github.com/user-attachments/assets/156b60d9-6659-489a-bdab-fb5c1eb69431" />
![befor_after](https://github.com/user-attachments/assets/8ab75723-08c4-4a82-ba6e-f73463d9475c)
![color](https://github.com/user-attachments/assets/e599ca28-0b15-4a44-b5cc-901bb385510f)

