1. 자바에서 상속에 대해서 정리.서술 해주세요
- 상속이란 물려준다는 의미이다. 어떤 객체가 있을 때 그 객체의 변수와 메소드를 다른객체가 물려받을 수 있는 기능을 상속이라고 한다.
즉, 상속이란 하위 클래스(자식클래스)가 상위 클래스(부모클래스)의 특징인 메소드와 변수를 그대로 물려받을 수 있는 것이다.



2. 오버로딩에 대해서 정리하여 서술해주세요.
- 한 클래스내에 같은 이름의 메소드를 여러개 정의해야 하는 것 이다
메서드 이름은 같아야 하고, 매개변수의 개수 또는 타입은 달라야 한다.
접근제한자는 같거나 다르게 지정해도 된다.



3.오버라이딩에 대해서 정리하여 서술해주세요.
- 부모가 갖고있는 메소드를 물려받긴 했지만 자식클래스의 필요에 따라서 그 메소드를 재정의해서 기능을 변경하는 것을 말한다.
매서드 이름도 같아야 하고, 매개변수도 같아야 한다.
또한 접근제한자는 부모클래스와 같거나 더 넓게 지정해야 한다.




4. 생성자와 메소드의 차이점에 대해 정리 서술해주세요.
- 생성자는 객체를 생성한다. 그 과정에서 해야할 일들을 생성자 메소드에 지정해서 초기화 할 수 있다.
생성자의 이름은 클래스의 이름과 동일해야하며 생성자를 이용함으로써 불필요한 자바소스코드를 줄일 수 있다.
하지만  객체를 초기화 하기 위해 사용되는 생성자와 달리 메소드는 함수로써 동작을 수행하기 위해 사용된다.

생성자는 무조건 클래스 이름과 이름이 같아야 하고 반환타입이 없지만 메소드는 반환타입이 있어야 한다