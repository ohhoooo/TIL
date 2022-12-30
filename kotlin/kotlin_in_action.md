> 해당 글은 [Kotlin in Action](http://www.yes24.com/Product/Goods/55148593?Acode=101)을 정리한 내용입니다.

# 목차
1. [코틀린이란 무엇이며, 왜 필요한가?](#01장-코틀린이란-무엇이며-왜-필요한가)
    1. [코틀린의 주요 특성](#1-코틀린의-주요-특성)
        1. [정적 타입 지원 언어](#정적-타입-지원-언어)
        2. [함수형 프로그래밍과 객체지향 프로그래밍](#함수형-프로그래밍과-객체지향-프로그래밍)
    2. [코틀린의 철학](#2-코틀린의-철학)
    3. [코틀린 도구 사용](#3-코틀린-도구-사용)
        1. [코틀린 코드 컴파일](#코틀린-코드-컴파일)
        2. [인텔리J 아이디어와 안드로이드 스튜디오의 코틀린 플러그인](#인텔리j-아이디어와-안드로이드-스튜디오의-코틀린-플러그인)
        3. [대화형 셸(REPL)](#대화형-셸repl)
        4. [온라인 놀이터](#온라인-놀이터)
2. [코틀린 기초](#02장-코틀린-기초)
    1. [함수와 변수](#1-함수와-변수)
        1. [함수](#함수)
        2. [변수](#변수)
        3. [문자열 템플릿](#문자열-템플릿)
    2. [클래스와 프로퍼티](#2-클래스와-프로퍼티)
        1. [프로퍼티](#프로퍼티)
        2. [커스텀 접근자](#커스텀-접근자)
        3. [디렉터리와 패키지](#디렉터리와-패키지)
    3. [enum과 when](#3-enum과-when)
        1. [enum 클래스 정의](#enum-클래스-정의)
        2. [when으로 enum 클래스 다루기](#when으로-enum-클래스-다루기)
        3. [when과 임의의 객체를 함께 사용](#when과-임의의-객체를-함께-사용)
        4. [인자 없는 when 사용](#인자-없는-when-사용)
        5. [스마트 캐스트](#스마트-캐스트)
      4. [while과 for 루프](#3-while과-for-루프)
         1. [수에 대한 이터레이션: 범위와 수열](#수에-대한-이터레이션-범위와-수열)
         2. [맵에 대한 이터레이션](#맵에-대한-이터레이션)
         3. [in으로 컬렉션이나 범위의 원소 검사](#in으로-컬렉션이나-범위의-원소-검사)
      5. [코틀린의 예외 처리](#4-코틀린의-예외-처리)
         1. [try, catch, finally](#try-catch-finally)
         2. [try를 식으로 사용](#try를-식으로-사용)
3. [함수 정의와 호출](#03장-함수-정의와-호출)
   1. [코틀린에서 컬렉션 만들기](#1-코틀린에서-컬렉션-만들기)
   2. [함수를 호출하기 쉽게 만들기](#2-함수를-호출하기-쉽게-만들기)
      1. [이름 붙인 인자](#이름-붙인-인자)
      2. [디폴트 파라미터 값](#디폴트-파라미터-값)
      3. [정적인 유틸리티 클래스 없애기: 최상위 함수와 프로퍼티](#정적인-유틸리티-클래스-없애기-최상위-함수와-프로퍼티)
   3. [메서드를 다른 클래스에 추가: 확장 함수와 확장 프로퍼티](#3-메서드를-다른-클래스에-추가-확장-함수와-확장-프로퍼티)
      1. [임포트와 확장 함수](#임포트와-확장-함수)
      2. [자바에서 확장 함수 호출](#자바에서-확장-함수-호출)
      3. [확장 함수로 유틸리티 함수 정의](#확장-함수로-유틸리티-함수-정의)
      4. [확장 프로퍼티](#확장-프로퍼티)
   4. [컬렉션 처리: 가변 길이 인자, 중위 함수 호출, 라이브러리 지원](#4-컬렉션-처리-가변-길이-인자-중위-함수-호출-라이브러리-지원)
      1. [자바 컬렉션 API 확장](#자바-컬렉션-api-확장)
      2. [가변 인자 함수: 인자의 개수가 달라질 수 있는 함수 정의](#가변-인자-함수-인자의-개수가-달라질-수-있는-함수-정의)
      3. [값의 쌍 다루기: 중위 호출과 구조 분해 선언](#값의-쌍-다루기-중위-호출과-구조-분해-선언)
   5. [문자열과 정규식 다루기](#5-문자열과-정규식-다루기)
      1. [문자열 나누기](#문자열-나누기)
      2. [정규식과 3중 따옴표로 묶은 문자열](#정규식과-3중-따옴표로-묶은-문자열)
      3. [여러 줄 3중 따옴표 문자열](#여러-줄-3중-따옴표-문자열)
   6. [코드 다듬기: 로컬 함수와 확장](#6-코드-다듬기-로컬-함수와-확장)
   
# 01장 코틀린이란 무엇이며 왜 필요한가?

* 코틀린은 자바 플랫폼에서 돌아가는 새로운 프로그래밍 언어
* 간결하고 실용적이며, 자바 코드와의 상호운용성을 중시
* 서버 개발, 안드로이드 앱 개발 등의 분야에서 활용
* 기존 자바 라이브러리나 프레임워크와 함께 잘 작동, 성능도 자바와 같은 수준

## 1. 코틀린의 주요 특성

### 정적 타입 지원 언어
: 정적 타입 지정이라는 말은 모든 프로그램 구성 요소의 타입을 컴파일 시점에 알 수 있고 프로그램 안에서 객체의 필드나 메서드를 사용할 때마다 컴파일러가 타입을 검증해준다는 뜻이다. 자바와 달리 코틀린에서는 모든 변수의 타입을 프로그래머가 직접 명시할 필요가 없다. 대부분의 경우 코틀린 컴파일러가 문맥으로부터 변수 타입을 자동으로 유추할 수 있기 때문에 프로그래머는 타입 선언을 생략해도 된다. 이런 기능을 타입 추론이라고 부른다.

정적 타입 지정의 장점
* 성능 - 실행 시점에 어떤 메서드를 호출할지 알아내는 과정이 필요 없으므로 메서드 호출이 더 빠르다.
* 신뢰성 - 컴파일러가 프로그램의 정확성을 검증하기 때문에 실행 시 프로그램이 오류로 중단될 가능성이 더 적어진다.
* 유지 보수성 - 코드에서 다루는 객체가 어떤 타입에 속하는지 알 수 있기 때문에 처음 보는 코드를 다룰 때도 더 쉽다.
* 도구 지원 - 정적 타입 지정을 활용하면 더 안전하게 리팩토링 할 수 있고, 도구는 더 정확한 코드 완성 기능을 제공할 수 있으며, IDE의 다른 지원 기능도 더 잘 만들 수 있다.

### 함수형 프로그래밍과 객체지향 프로그래밍
함수형 프로그래밍의 핵심 개념
* 일급 시민인 함수 - 함수를 일반 값처럼 다룰 수 있다. 함수를 변수에 저장할 수 있고, 함수를 인자로 다른 함수에 전달할 수 있으며, 함수에서 새로운 함수를 만들어서 반환할 수 있다.
* 불변성 - 함수형 프로그래밍에서는 일단 만들어지고 나면 내부 상태가 절대로 바뀌지 않는 불변 객체를 사용해 프로그램을 작성한다.
* 부수 효과 없음 - 함수형 프로그래밍에서는 입력이 같으면 항상 같은 출력을 내놓고 다른 객체의 상태를 변경하지 않으며, 함수 외부나 다른 바깥 환경과 상호작용하지 않는 순수 함수를 사용한다.

## 2. 코틀린의 철학
* 간결성 - getter,setter,생성자 파라미터를 필드에 대입하기 위한 로직 등 자바에 존재하는 여러 가지 번거로운 준비 코드를 코틀린은 묵시적으로 제공한다. 컬렉션에서 원소를 찾는 것과 같은 일반적인 작업을 수행하기 위해 명시적으로 작성해야만 하는 코드의 양을 라이브러리 함수 호출로 대치할 수 있다.
* 상호운용성 - 기존 라이브러리를 그대로 사용할 수 있다.
* 안전성 - 코틀린을 JVM에서 실행한다는 사실은 이미 상당한 안전성을 보장할 수 있다는 뜻이다. 코틀린의 타입 시스템은 null이 될 수 없는 값을 추적하며, 실행 시점에 NullPointerException이 발생할 수 있는 연산을 사용하는 코드를 금지한다.
```kotlin
val s: String? = null // 널이 될 수 있음
val s2: String = "" // 널이 될 수 없음
```
코틀린이 방지해주는 다른 예외로는 ClassCastException이 있다. 자바에서는 타입 검사와 그 직후 이뤄지는 타입 캐스트에서 같은 타입 이름을 반복 사용하는 것이 귀찮아서 타입 검사를 생략하는 개발자가 많다. 반면 코틀린에서는 타입 검사와 캐스트가 한 연산자에 의해 이뤄진다. 어떤 객체의 타입을 검사했고 그 객체가 그 타입에 속한다면 해당 타입의 메서드나 필드 등의 멤버를 별도의 캐스트 없이 사용할 수 있다.
```kotlin
if(value is String) // 타입을 검사한다.
    println(value.toUpperCase()) // 해당 타입의 메서드를 사용한다.
```
## 3. 코틀린 도구 사용
### 코틀린 코드 컴파일
![](../assets/kotlin-compile-flow.png)

코틀린 컴파일러로 컴파일한 코드는 코틀린 런타임 라이브러리에 의존한다.

### 인텔리J 아이디어와 안드로이드 스튜디오의 코틀린 플러그인
* 인텔리J 아이디어 15나 그 이후의 버전 - 코틀린 플러그인이 기본 포함돼 있다.
* 안드로이드 스튜디오 - 플러그인 관리자를 통해 코틀린 플러그인을 설치해야한다.

### 대화형 셸(REPL)
 : 코틀린 코드를 빨리 시험해보고 싶을 때 사용하는 도구(한 줄 실행)

 * kotlinc 명령을 아무 인자 없이 실행
 * 인텔리J 아이디어 플러그인의 메뉴(Tool > 코틀린 > 코틀린 REPL)를 사용

### 온라인 놀이터
 : [프로그램을 설치하거나 설정할 필요 없이 코틀린을 써볼 수 있는 아주 쉬운 방법](http://try.kotl.in/)

# 02장 코틀린 기초
 * 함수를 최상위 수준에 정의할 수 있다. 꼭 클래스 안에 함수를 넣어야 할 필요가 없다.
 * `System.out.println` 대신에 `println` 이라고 쓴다. 코틀린 표준 라이브러리는 여러 가지 표준 자바 라이브러리 함수를 간결하게 사용할 수 있게 감싼 래퍼를 제공한다. `println`도 그런 함수 중 하나다.

 ## 1. 함수와 변수
 
 ### 함수
 * 문(statement)과 식(expression)의 구분 - 코틀린에서 if는 식이지 문이 아니다. 식은 값을 만들어 내며 다른 식의 하위 요소로 계산에 참여할 수 있는 반면 문은 자신을 둘러싸고 있는 가장 안쪽 블록의 최상위 요소로 존재하며 아무런 값을 만들어내지 않는다는 차이가 있다. 코틀린에서는 루프를 제외한 대부분의 제어 구조가 식이다.
 * 블록이 본문인 함수 - 본문이 중괄호로 둘러싸인 함수
 ```kotlin
 fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
 }
 ```
 식이 본문인 함수 - 등호와 식으로 이뤄진 함수
 ```kotlin
 fun max(a: Int, b: Int): Int = if(a > b) a else b
 ```
 반환 타입을 생략 - 컴파일러가 타입을 분석해 프로그램 구성 요소의 타입을 정해줌 (타입 추론), 식이 본문인 함수의 반환 타입만 생략 가능
 ```kotlin
 fun max(a: Int, b: Int) = if(a > b) a else b
 ```

 ### 변수
 ```kotlin
 val answer = 42 // 1.타입을 생략한 경우
 val answer: Int = 42 // 2.타입을 명시한 경우
 val answer: Int // 3.초기화 식을 사용하지 않고 변수를 선언하려면
 answer = 42 // 변수 타입을 반드시 명시해야 한다.
 ```
 변경 가능한 변수와 변경 불가능한 변수
 * val - 변경 불가능한 참조를 저장하는 변수, val로 선언된 변수는 일단 초기화하고 나면 재대입이 불가능하다. 자바로 final 변수에 해당
 * var - 변경 가능한 참조를 저장하는 변수, 이런 변수의 값은 바뀔 수 있다. 자바의 일반 변수에 해당
 * 기본적으로는 모든 변수를 val 키워드를 사용해 불변 변수로 선언하고, 나중에 꼭 필요할 때에만 var로 변경한다.

 val 참조 자체는 불변일지라도 그 참조가 가리키는 객체의 내부 값은 변경될 수 있다.
 ```kotlin
 val languages = arrayListOf("Java") // 불변 참조를 선언
 languages.add("Kotlin") // 참조가 가리키는 객체 내부를 변경
 ```
 
 ### 문자열 템플릿
 ```kotlin
 fun main(args: Array<String>) {
    val name = if(args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
 } // 간단한 변수
 
 fun main(args: Array<String>) {
    if(args.size > 0) {
        println("Hello, ${args[0]}!")
    }
 } // 복잡한 식 {}

 fun main(args: Array<String>) {
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
 } // 중괄호로 둘러싼 식 안에서 큰 따옴표 사용
 ```

 ## 2. 클래스와 프로퍼티
 클래스라는 개념의 목적은 데이터를 캡슐화하고 캡슐화한 데이터를 다루는 코드를 한 주체 아래 가두는 것이다. 자바에서는 필드(보통 private)와 접근자(보통 getter, 필드를 변경하게 허용해야 할 경우 setter를 추가 제공)를 한데 묶어 프로퍼티라고 부른다.

 ### 프로퍼티
 * `코틀린 프로퍼티는 자바의 필드와 접근자 메서드를 완전히 대신한다.`
 ```kotlin
 class Person (
    val name: String, // 읽기 전용 프로퍼티로, 코틀린은 (비공개) 필드와 필드를 읽는 단순한 (공개) 게터를 만들어낸다.
    var isMarried: Boolean // 쓸 수 있는 프로퍼티로, 코틀린은 (비공개) 필드, (공개) 게터, (공개) 세터를 만들어낸다.
 )
 ```

 ### 커스텀 접근자
 ```kotlin
 class Rectangle(val height: Int, val width: Int) {
     val isSquare: Boolean
         get() { // 프로퍼티 게터 선언, 자체 값을 저장하는 필드x, 자체 구현을 제공하는 게터만 존재, 접근할 때마다 게터가 프로퍼티 값을 매번 다시 계산한다.
             return height == width
         }
 }
 ```
 ```kotlin
 class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width // 블록을 본문으로 하는 복잡한 구문을 꼭 사용하지 않아도 된다.
 }
 ```

 ### 디렉터리와 패키지
 * 모든 코틀린 파일의 맨 앞에 package문을 넣을 수 있다. 그러면 그 파일 안에 있는 모든 선언(클래스, 함수, 프로퍼티 등)이 해당 패키지에 들어간다.
 * 같은 패키지에 속해 있다면 다른 파일에서 정의한 선언일지라도 직접 사용할 수 있다.
 * 다른 패키지에 정의한 선언을 사용하려면 임포트를 통해 선언을 불러와야 한다.
 * 코틀린에서는 클래스 임포트와 함수 임포트에 차이가 없으며, 모든 선언을 import 키워드로 가져올 수 있다.(최상위 함수는 그 이름을 써서 임포트할 수 있다.)
 * 패키지 이름 뒤에.*를 추가하면 패키지 안의 모든 선언을 임포트할 수 있다.(패키지안에 있는 모든 클래스뿐 아니라 최상위에 정의된 함수나 프로퍼티까지 모두 불러온다.)

 ## 3. enum과 when
 * 소프트 키워드 - enum은 class앞에 있을 때는 특별한 의미를 지니지만 다른 곳에서는 이름에 사용할 수 있다.
 * 키워드 - class라는 이름을 사용할 수 없으므로 클래스를 표현하는 변수등을 정의할 때는 clazz나 aClass와 같은 이름을 사용해야 한다.

 ### enum 클래스 정의
 ```kotlin
 enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
 } // 간단한 enum 클래스
 ```
 ```kotlin
 enum class Color (
    val r: Int, val g: Int, val b: Int // 상수의 프로퍼티를 정의한다.
 ) {
    RED(255,0,0), ORANGE(255,165,0), // 각 상수를 생성할 때 그에 대한 프로퍼티 값을 지정한다.
    YELLOW(255,255,0), GREEN(0,255,0), BLUE(0,0,255),
    INDIGO(75,0,130), VIOLET(238,130,238); // 여기 반드시 세미콜론을 사용해야 한다.

    fun rgb() = (r * 256 + g) * 256 + b // enum 클래스 안에서 메서드를 정의한다.
 }
 >>> println(Color.BLUE.rgb())
 255
 ```

 ### when으로 enum 클래스 다루기
 ```kotlin
 fun getMnemonic(color: Color) = 
    when(color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "Battle"
    }
 >>> println(getMnemonic(Color.BLUE))
 Battle
 ```

 ### when과 임의의 객체를 함께 사용
 코틀린에서 when은 자바의 switch보다 훨씬 더 강력하다. 분기 조건에 상수(enum 상수나 숫자 리터럴)만을 사용할 수 있는 자바 switch와 달리 코틀린 when의 분기 조건은 임의의 객체를 허용한다.
 ```kotlin
 fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }
 >>> println(mix(BLUE, YELLOW))
 GREEN
 ```
 
 ### 인자 없는 when 사용
 when에 아무 인자도 없으려면 각 분기의 조건이 불리언 결과를 계산하는 식이어야 한다.
 ```kotlin
 fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }
 >> println(mixOptimized(BLUE, YELLOW))
 GREEN
 ```
 
 ### 스마트 캐스트
 * 어떤 변수가 원하는 타입인지 일단 is로 검사하고 나면 굳이 변수를 원하는 타입으로 캐스팅하지 않아도 마치 처음부터 그 변수가 원하는 타입으로 선언된 것처럼 사용할 수 있다. 하지만 실제로는 컴파일러가 캐스팅을 수행해준다. 이를 스마트 캐스트라고 부른다.
 * if와 when의 분기에서 블록을 사용 할 경우 블록의 마지막 문장이 블록 전체의 결과가 된다.
 ```kotlin
 fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }
 ```

 ## 3. while과 for 루프
 * 코틀린 while 루프는 자바와 동일
 * for는 자바의 for-each 루프에 해당하는 형태만 존재

 ### 수에 대한 이터레이션: 범위와 수열
 for 루프의 가장 흔한 용례인 초깃값, 증가 값, 최종 값을 사용한 루프를 대신하기 위해 코틀린에서는 범위를 사용한다. 범위는 기본적으로 두 값으로 이뤄진 구간이다. 보통은 그 두 값은 정수 등의 숫자 타입의 값이며, `.. 연산자`로 시작 값과 끝 값을 연결해서 범위를 만든다. `downTo,step,until 등이 있다.`

 ```kotlin
 fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
 }

 for (i in 1..100) { // 1부터 100까지 정수에 대해 이터레이션
    print(fizzBuzz(i))
 }
 >>> 1 2 Fizz 4 Buzz Fizz 7 ...

 for (i in 100 downTo 1 step 2) {
    print(fizzBuzz(i))
 }
 >>> Buzz 98 Fizz 94 92 FizzBuzz 88 ...
 ```

 ### 맵에 대한 이터레이션
 .. 연산자를 숫자 타입의 값뿐 아니라 문자 타입의 값에도 적용할 수 있다. 키를 사용해 맵의 값을 가져오거나 키에 해당하는 값을 설정하는 get과 put을 사용하는 대신 map[key]나 map[key] = value를 사용해 값을 가져오고 설정할 수 있다.
 ```kotlin
 val binaryReps = TreeMap<Char, String>() // 키를 정렬하기 위해 TreeMap 사용

 for(c in 'A' .. 'F') { // A ~ F까지 문자의 범위를 사용해 이터레이션
   val binary = Integer.toBinaryString(c.toInt())
   binaryReps[c] = binary // c를 키로 c의 2진 표현을 맵에 넣는다.
 }

 for((letter, binary) in binaryReps) { // 맵에 대해 이터레이션한다. 맵의 키와 값을 두 변수에 각각 대입한다.
   println("$letter = $binary")
 }
 ```

 맵에 사용했던 구조 분해 구문을 맵이 아닌 컬렉션에도 활용할 수 있다.
 ```kotlin
 val list = arrayListOf("10", "11", "1001")
 for ((index, element), in list.withIndex()) {
   println("$index: $element")
 }
 ```

 ### in으로 컬렉션이나 범위의 원소 검사
 in 연산자를 사용해 어떤 값이 범위에 속하는지 검사할 수 있다. 반대로 !in을 사용하면 어떤 값이 범위에 속하지 않는지 검사할 수 있다.
 ```kotlin
 fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
 fun isNotDigit(c: Char) = c !in '0'..'9'
 >> println(isLetter('q'))
 true
 >> println(isNotDigit('x'))
 true
 ```

 ```kotlin
 fun recognize(c: Char) = when (C) {
   in '0'..'9' -> "It's a digit!"
   in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
   else -> "I don't know..."
 }
 >>> println(recognize('8'))
 It's a digit!
 ```

 ## 4. 코틀린의 예외 처리
 코틀린의 예외 처리는 자바나 다른 언어의 예외 처리와 비슷하다. 발생한 예외를 함수 호출단에서 처리하지 않으면 함수 호출 스택을 거슬러 올라가면서 예외를 처리하는 부분이 나올 때까지 예외를 다시 던진다.
 
 ```kotlin
 if (percentage !in 0..100) {
   throw IllegalArgumentException ( // 코틀린의 throw는 식이다.
      "A percentage value must be between 0 and 100: $percentage")
 }
 ```

 ### try, catch, finally
 자바 코드와 가장 큰 차이는 throws 절이 코드에 없다는 점이다. 자바에서는 함수를 작성할 때 함수 선언 뒤에 throws IOException을 붙어야 한다. 이유는 IOException이 체크 예외이기 때문이고 자바에서는 체크 예외를 명시적으로 처리해야 한다. 어떤 함수가 던질 가능성이 있는 예외나 그 함수가 호출한 다른 함수에서 발생할 수 있는 예외를 모두 catch로 처리해야 하며, 처리하지 않은 예외는 throws 절에 명시해야 한다.

 코틀린은 체크 예외와 언체크 예외를 구별하지 않는다. 코틀린에서는 함수가 던지는 예외를 지정하지 않고 발생한 예외를 잡아내도 되고 잡아내지 않아도 된다.
 ```kotlin
 fun readNumber(reader: BufferedReader): Int? {
   try {
      val line = reader.readLine()
      return Integer.parseInt(line)
   } catch(e: NumberFormatException) {
      return null
   } finally {
      reader.close()
   }
 }
 ```

 ### try를 식으로 사용
 * 코틀린의 try 키워드는 if나 when과 마찬가지로 식이다.
 * if와 달리 try의 본문을 반드시 중괄호 {}로 둘러싸야 한다.
 * try의 본문도 내부에 여러 문장이 있으면 마지막 식의 값이 전체 결과 값이다.
 * 이 예제는 catch 블록 안에서 return 문을 사용하기 때문에 예외가 발생한 경우 catch 블록 다음의 코드는 실행되지 않는다.
 ```kotlin
 fun readNumber(reader: BufferedReader) {
   val number = try {
      Integer.parseInt(reader.readLine())
   } catch(e: NumberFormatException) {
      return
   }
   println(number)
 }
 ```

# 03장 함수 정의와 호출

 * 여기서 to는 언어가 제공하는 특별한 키워드가 아니라 일반 함수
 * 코틀린의 javaClass = 자바의 getClass()

 ## 1. 코틀린에서 컬렉션 만들기
 ```kotlin
 val set = hashSetOf(1,7,53)
 val list = arrayListOf(1,7,53)
 val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

 >>> println(set.javaClass) // class java.util.HashSet
 >>> println(list.javaClass) // class java.util.ArrayList
 >>> println(map.javaClass) // class java.util.HashMap
 ```
 위의 결과는 코틀린이 자신만의 컬렉션 기능을 제공하지 않는다는 뜻이다. 표준 자바 컬렉션을 활용하면 자바 코드와 상호작용하기가 훨씬 더 쉽다. 자바에서 코틀린 함수를 호출하거나 코틀린에서 자바 함수를 호출할 때 자바와 코틀린 컬렉션을 서로 변환할 필요가 없다. 코틀린 컬렉션은 자바 컬렉션과 똑같은 클래스다. 하지만 코틀린에서는 자바보다 더 많은 기능을 쓸 수 있다.

 ```kotlin
 val strings = listOf("first", "second", "fourteenth")
 >>> println(strings.last()) // fourteenth
 
 val numbers = setOf(1, 14, 2)
 >>> println(numbers.max()) // 14
 ```

 ## 2. 함수를 호출하기 쉽게 만들기
 * 어떻게 하면 이 함수를 호출하는 문장을 덜 번잡하게 만들 수 있을까?
 * 함수를 호출할 때 마다 매번 네 인자를 모두 전달하지 않을 수는 없을까?
 ```kotlin
 fun <T> joinToString(
   collection: Collection<T>,
   separator: String,
   prefix: String,
   postfix: String
 ): String {
   val result = StringBuilder(prefix)
   for((index, element) in collection.withIndex()) {
      if (index > 0) result.append(separator)
      result.append(element)
   }
   result.append(postfix)
   return result.toString()
 }

 val list = listOf(1,2,3)
 >>> println(joinToString(list, "; ", "(", ")")) // (1; 2; 3)
 ```

 ### 이름 붙인 인자
 코틀린으로 작성한 함수를 호출할 때는 함수에 전달하는 인자 중 일부(또는 전부)의 이름을 명시할 수 있다. 호출 시 인자 중 어느 하나라도 이름을 명시하고 나면 혼동을 막기 위해 그 뒤에 오는 모든 인자는 이름을 꼭 명시해야 한다.
 ```kotlin
 joinToString(collection, " ", " ", ".")
 joinToString(collection, separator = " ", prefix = " ", postfix = ".") // 개선
 ```

 ### 디폴트 파라미터 값
 코틀린에서는 함수 선언에서 파라미터의 디폴트 값을 지정할 수 있으므로 이런 오버로드 중 상당수를 피할 수 있다.
 ```kotlin
 fun <T> joinToString (
   collection: Collection<T>,
   separator: String = ", ", // 디
   prefix: String = "", // 폴
   postfix: String = "" // 트 값이 지정된 파라미터들
 ): String

 >>> joinToString(list, ", ", "", "") // 1, 2, 3
 >>> joinToString(list) // 1, 2, 3
 >>> joinToString(list, "; ") // 1; 2; 3
 ```

 이름 붙인 인자를 사용하는 경우에는 인자 목록의 중간에 있는 인자를 생략하고, 지정하고 싶은 인자를 이름을 붙여서 순서와 관계없이 지정할 수 있다.
 ```kotlin
 >>> joinToString(list, postfix = ";", prefix = "# ") // # 1, 2, 3;
 ```

 ### 정적인 유틸리티 클래스 없애기: 최상위 함수와 프로퍼티
 실전에서 어느 한 클래스에 포함시키기 어려운 코드가 많이 생긴다. 그 결과 다양한 정적 메서드를 모아두는 역할만 담당하며, 특별한 상태나 인스턴스 메서드는 없는 클래스가 생겨난다. JDK의 Collections 클래스가 전형적인 예이다. 코틀린에서는 이런 무의미한 클래스가 필요 없다. 대신 함수를 직접 소스 파일의 최상위 수준, 모든 다른 클래스의 밖에 위치시키면 된다. 그런 함수들은 여전히 그 파일의 맨 앞에 정의된 패키지의 멤버 함수이므로 다른 패키지에서 그 함수를 사용하고 싶을 때는 그 함수가 정의된 패키지를 임포트해야만 한다. 하지만 임포트 시 유틸리티 클래스 이름이 추가로 들어갈 필요는 없다.

 JVM이 클래스 안에 들어있는 코드만을 실행할 수 있기 때문에 컴파일러는 이 파일을 컴파일할 때 새로운 클래스를 정의해준다. 하지만 이 함수를 자바 등의 다른 JVM 언어에서 호출하고 싶다면 코드가 어떻게 컴파일되는지 알아야 joinToString과 같은 최상위 함수를 사용할 수 있다. 어떻게 코틀린이 join.kt를 컴파일하는지 보여주기 위해 join.kt를 컴파일한 결과와 같은 클래스를 자바 코드로 써보면 다음과 같다.
 ```kotlin
 /* 코틀린 */
 package strings
 fun joinToString(...): String { ... }

 /* 자바 */
 package strings;
 public class JoinKt {
   public static String joinToString(...) { ... }
 }
 ```

 코틀린 컴파일러가 생성하는 클래스의 이름은 최상위 함수가 들어있던 코틀린 소스 파일의 이름과 대응한다. 코틀린 파일의 모든 최상위 함수는 이 클래스의 정적인 메서드가 된다. 따라서 자바에서 joinToString을 호출하기는 쉽다.
 ```java
 import strings.JoinKt;
 ...
 JoinKt.joinToString(list, ", ", "", "");
 ```

 함수와 마찬가지로 프로퍼티도 파일의 최상위 수준에 놓을 수 있다. 이런 프로퍼티의 값은 정적 필드에 저장된다. 
 ```kotlin
 var opCount = 0
 
 fun performOperation() {
   opCount++
 }

 fun reportOperationCount() {
   println("Operation performed $opCount times")
 }
 ```

 최상위 프로퍼티를 활용해 코드에 상수를 추가할 수 있다.
 ```kotlin
 val UNIX_LINE_SEPARATOR = "\n"
 ```

 기본적으로 최상위 프로퍼티도 다른 모든 프로퍼티처럼 접근자 메서드를 통해 자바 코드에 노출된다.(val의 경우 게터, var의 경우 게터와 세터가 생긴다.) 겉으론 상수처럼 보이는데, 실제로는 게터를 사용해야 한다면 자연스럽지 못하다. 더 자연스럽게 사용하려면 이 상수를 public static final 필드로 컴파일해야 한다. const 변경자를 추가하면 프로퍼티를 public static final 필드로 컴파일하게 만들 수 있다.(단, 원시 타입과 String 타입의 프로퍼티만 const로 지정할 수 있다)
 ```kotlin
 const val UNIX_LINE_SEPARATOR = "\n"
 ```

 앞의 코드는 다음 자바 코드와 동등한 바이트코드를 만들어낸다.
 ```java
 public static final String UNIX_LINE_SEPARATOR = "\n";
 ```

 ## 3. 메서드를 다른 클래스에 추가: 확장 함수와 확장 프로퍼티
 확장 함수는 어떤 클래스의 멤버 메서드인 것처럼 호출할 수 있지만 그 클래스의 밖에 선언된 함수다. 확장 함수를 만들려면 추가하려는 함수 이름 앞에 그 함수가 확장할 클래스의 이름을 덧붙이기만 하면 된다. 클래스 이름을 수신 객체 타입이라 부르며, 확장 함수가 호출되는 대상이 되는 값을 수신 객체라고 부른다.
 ```kotlin
 package strings
 fun String.lastChar(): Char = this.get(this.length - 1)
 >> println("Kotlin".lastChar()) // n
 ```
 
 일반 메서드의 본문에서 this를 사용할 때와 마찬가지로 확장 함수 본문에도 this를 쓸 수 있다. 그리고 일반 메서드와 마찬가지로 확장 함수 본문에서도 this를 생략할 수 있다.
 ```kotlin
 package strings
 fun String.lastChar(): Char = get(length - 1)
 ```

 확장 함수 내부에서는 일반적인 인스턴스 메서드의 내부에서와 마찬가지로 수신 객체의 메서드나 프로퍼티를 바로 사용할 수 있다. 하지만 확장 함수가 캡슐화를 깨지는 않는다. 클래스 안에서 정의한 메서드와 달리 확장 함수 안에서는 클래스 내부에서만 사용할 수 있는 비공개(private) 멤버나 보호된(protected) 멤버를 사용할 수 없다.

 ### 임포트와 확장 함수
 확장 함수를 사용하기 위해서는 그 함수를 다른 클래스나 함수와 마찬가지로 임포트해야만 한다.
 ```kotlin
 import strings.lastChar
 import strings.* // *를 사용한 임포트

 val c = "Kotlin".lastChar()

 import strings.lastChar as last // as 키워드를 사용하면 임포트한 클래스나 함수를 다른 이름으로 부를 수 있다.

 val c = "Kotlin".last()
 ```

 ### 자바에서 확장 함수 호출
 내부적으로 확장 함수는 수신 객체를 첫 번째 인자로 받는 정적 메서드다. 확장 함수를 호출하면서 첫 번째 인자로 수신 객체를 넘기기만 하면 된다.
 ```java
 char c = StringUtilKt.lastChar("Java"); // 확장 함수를 StringUtil.kt 파일에 정의
 ```

 ### 확장 함수로 유틸리티 함수 정의
 ```kotlin
 fun <T> Collection<T>.joinToString (
   separator: String = ", ",
   prefix: String = "",
   postfix: String = ""
 ) : String {
   val result = StringBuilder(prefix)

   for((index, element) in this.withIndex()) {
      if(index > 0) result.append(separator)
      result.append(element)
   }
   result.append(postfix)
   return result.toString()
 }
 >>> val list = listOf(1,2,3)
 >>> println(list.joinToString(separator = "; ", prefix = "(", postfix = ")")) // (1; 2; 3)
 ```

 확장 함수는 클래스가 아닌 더 구체적인 타입을 수신 객체 타입으로 지정할 수도 있다.
 ```kotlin
 fun Collection<String>.join(
   separator: String = ", ",
   prefix: String = "",
   postfix: String = ""
 ) = joinToString(separator, prefix, postfix)

 >>> println(listOf("one", "two", "eight").join(" ")) // one two eight
 ```

 확장 함수가 정적 메서드와 같은 특징을 가지므로, 확장 함수를 하위 클래스에서 오버라이드할 수는 없다.

 ### 확장 프로퍼티
 확장 프로퍼티를 사용하면 기존 클래스 객체에 대한 프로퍼티 형식의 구문으로 사용할 수 있는 API를 추가할 수 있다. 프로퍼티라는 이름으로 불리기는 하지만 상태를 저장할 적절한 방법이 없기 때문에(기존 클래스의 인스턴스 객체에 필드를 추가할 방법은 없다) 실제로 확장 프로퍼티는 아무 상태도 가질 수 없다. 하지만 프로퍼티 문법으로 더 짧게 코드를 작성할 수 있어서 편한 경우가 있다.
 ```kotlin
 val String.lastChar: Char
   get() = get(length - 1)
 ```

 확장 함수의 경우와 마찬가지로 확장 프로퍼티도 일반적인 프로퍼티와 같은데, 단지 수신 객체 클래스가 추가됐을 뿐이다. 뒷받침하는 필드(프로퍼티의 값을 저장하기 위한 필드)가 없어서 기본 게터 구현을 제공할 수 없으므로 최소한 게터는 꼭 정의를 해야 한다. 마찬가지로 초기화 코드에서 계산한 값을 담을 장소가 전혀 없으므로 초기화 코드도 쓸 수 없다.

 StringBuilder에 같은 프로퍼티를 정의한다면 StringBuilder의 맨 마지막 문자는 변경 가능하므로 프로퍼티를 var로 만들 수 있다.
 ```kotlin
 var Stringbuilder.lastChar: Char
   get() = get(length - 1) // 프로퍼티 게터
   set(value: Char) {
      this.setCharAt(length - 1, value) // 프로퍼티 세터
   }
 >>> println("Kotlin".lastChar) // n

 >>> val sb = StringBuilder("Kotlin?")
 >>> sb.lastChar = '!'
 >>> println(sb) // Kotlin!
 ```

 ## 4. 컬렉션 처리: 가변 길이 인자, 중위 함수 호출, 라이브러리 지원
 
 ### 자바 컬렉션 API 확장
 코틀린의 컬렉션은 자바와 같은 클래스를 사용하지만 더 확장된 API를 제공한다. [리스트의 마지막 원소를 가져오는 예제와 숫자로 이뤄진 컬렉션의 최댓값을 찾는 예제](#1-코틀린에서-컬렉션-만들기)의 last와 max는 모두 확장 함수이다. 코틀린 표준 라이브러리는 수많은 확장 함수를 포함하는데 궁금할 때마다 IDE의 코드 완성 기능을 통해 그런 메서드나 함수를 살펴볼 수 있다.

 ### 가변 인자 함수: 인자의 개수가 달라질 수 있는 함수 정의
 자바의 가변 길이 인자는 타입 뒤에 ...를 붙이지만 코틀린에서는 파라미터 앞에 vararg 변경자를 붙인다.
 ```kotlin
 fun listOf<T> (vararg values: T): List<T> { ... }

 val list = listOf(2, 3, 5, 7, 11)
 ```

 이미 배열에 들어있는 원소를 가변 길이 인자로 넘길 때 자바에서는 배열을 그냥 넘기면 되지만 코틀린에서는 배열을 명시적으로 풀어서 배열의 각 원소가 인자로 전달되게 해야 한다. 기술적으로는 스프레드 연산자가 그런 작업을 해준다. 하지만 실제로는 전달하려는 배열 앞에 *를 붙이기만 하면 된다.
 ```kotlin
 fun main(args: Array<String>) {
   val list = listOf("args: ", *args) // 스프레드 연산자가 배열의 내용을 펼쳐준다.
   println(list)
 }
 ```

 ### 값의 쌍 다루기: 중위 호출과 구조 분해 선언
 맵을 만들려면 mapOf 함수를 사용한다. 여기서 to라는 단어는 코틀린 키워드가 아니다. 이 코드는 **중위 호출이라는 특별한 방식으로 to라는 일반 메서드를 호출**한 것이다.
 ```kotlin
 fun <K, V> mapOf(vararg values: Pair<K, V>): Map<K, V>

 val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
 ```

 중위 호출 시에는 수신 객체와 유일한 메서드 인자 사이에 메서드 이름을 넣는다.(이때 객체, 메서드 이름, 유일한 인자 사이에는 공백이 들어가야 한다) 다음 두 호출은 동일하다.
 ```kotlin
 1.to("one") // "to" 메서드를 일반적인 방식으로 호출함
 1 to "one" // "to" 메서드를 중위 호출 방식으로 호출함
 ```

 **인자가 하나뿐인 일반 메서드나 인자가 하나뿐인 확장 함수에 중위 호출을 사용**할 수 있다. 함수를 중위 호출에 사용하게 허용하고 싶으면 `infix` 변경자를 함수 선언 앞에 추가해야 한다.
 ```kotlin
 infix fun Any.to(other: Any) = Pair(this, other) // to 함수의 정의를 간략하게 줄인 코드
 ```

 Pair의 내용으로 두 변수를 즉시 초기화할 수 있다. 이런 기능을 **구조 분해 선언**이라고 부른다. to 함수는 확장 함수다.
 ```kotlin
 val (number, name) = 1 to "one"
 ```
 
 그림은 Pair에 대해 구조 분해가 어떻게 작동하는지 보여준다. to 함수를 사용해 순서쌍을 만든 다음 구조 분해를 통해 그 순서쌍을 풀기

 ![](../assets/kotlin-structural%20decomposition-flow.png)

 루프에서도 구조 분해 선언을 활용할 수 있다.
 ```kotlin
 for((index, element) in collection.withIndex()) {
   println("$index: $element")
 }
 ```

 ## 5. 문자열과 정규식 다루기

 ### 문자열 나누기
 자바의 split 메서드는 점(.)을 사용해 문자열을 분리할 수 없다.(빈 배열을 반환한다.) split의 구분 문자열은 실제로는 정규식이기 때문이다. 코틀린에서는 자바의 split 대신에 여러 가지 다른 조합의 파라미터를 받는 split 확장 함수를 제공함으로써 혼동을 야기하는 메서드를 감춘다. 정규식을 파라미터로 받는 함수는 String이 아닌 Regex 타입의 값을 받는다. 따라서 **코틀린에서는 split 함수에 전달하는 값의 타입에 따라 정규식이나 일반 텍스트 중 어느 것으로 문자열을 분리하는지 쉽게 알 수 있다.**

 정규식을 처리하는 API는 표준 자바 라이브러리 API와 비슷하지만 좀 더 코틀린답게 변경됐다. 예를 들어 코틀린에서는 toRegex 확장 함수를 사용해 문자열을 정규식으로 변환할 수 있다.
 ```kotlin
 >>> println("12.345-6.A".split("\\.|-".toRegex())) // 정규식을 명시적으로 만든다.
 [12, 345, 6, A]
 ```

 간단한 경우에는 꼭 정규식을 쓸 필요가 없다. split 확장 함수를 오버로딩한 버전 중에는 구분 문자열을 하나 이상 인자로 받는 함수가 있다. 문자열 대신 문자를 인자로 넘겨도 결과는 동일하다.
 ```kotlin
 >>> println("12.345-6.A".split(".", "-")) // 여러 구분 문자열을 지정한다.
 [12, 345, 6, A]
 ```

 ### 정규식과 3중 따옴표로 묶은 문자열
 String을 확장한 함수를 사용하여 경로 파싱을 구현한 버전
 ```kotlin
 fun parsePath(path: String) {
   val directory = path.substringBeforeLast("/")
   val fullName = path.substringAfterLast("/")

   val fileName = fullName.substringBeforeLast(".")
   val extension = fullName.substringAfterLast(".")

   println("Dir: $directory, name: $fileName, ext: $extension")
 }
 >>> parsePath("/Users/yole/kotlin-book/chapter.adoc")
 Dir: /Users/yole/kotlin-book, name: chapter, ext: adoc
 ```

 정규식이 필요할 때는 코틀린 라이브러리를 사용하면 더 편하다. 다음은 같은 작업을 정규식을 활용해 구현한 프로그램이다.
 ```kotlin
 fun parsePath(path: String) {
   val regex = """(.+)/(.+)\.(.+)""".toRegex()
   val matchResult = regex.matchEntire(path)

   if(matchResult != null) {
      val(directory, filename, extension) = matchResult.destructured
      println("Dir: $directory, name: $filename, ext: $extension")
   }
 }
 ```

 3중 따옴표 문자열을 사용해 정규식을 썼다. 3중 따옴표 문자열에서는 역슬래시를 포함한 어떤 문자도 이스케이프할 필요가 없다. 예를들어 일반 문자열을 사용해 정규식을 작성하는 경우 마침표 기호를 이스케이프하려면 `\\.`라고 써야 하지만, 3중 따옴표 문자열에서는 `\.`라고 쓰면 된다.

 ### 여러 줄 3중 따옴표 문자열
 3중 따옴표 문자열에는 줄 바꿈을 표현하는 아무 문자열이나(이스케이프 없이) 그대로 들어간다. 따라서 3중 따옴표를 쓰면 줄 바꿈이 들어있는 프로그램 텍스트를 쉽게 문자열로 만들 수 있다.

 여러 줄 문자열에는 들여쓰기나 줄 바꿈을 포함한 모든 문자가 들어간다. 여러 줄 문자열을 코드에서 더 보기 좋게 표현하고 싶다면 들여쓰기를 하되 들여쓰기의 끝 부분을 특별한 문자열로 표시하고, trimMargin을 사용해 그 문자열과 그 직전의 공백을 제거한다.
 ```kotlin
 val kotlinLogo = """|  //
                    .| //
                    .|/ \"""
 >>> println(kotlinLogo.trimMargin("."))
 ```

 여러 줄 문자열에는 줄 바꿈이 들어가지만 줄 바꿈을 \n과 같은 특수 문자를 사용해 넣을 수는 없다. 반면에 \를 문자열에 넣고 싶으면 이스케이프할 필요가 없다.
 ```kotlin
 "C:\\Users\\yole\\kotlin-book" // 일반 문자열로 작성
 """C:\Users\yole\kotlin-book""" // 3중 따옴표 문자열로 작성
 ```

 3중 따옴표 문자열 안에 문자열 템플릿을 사용할 수도 있다. 그러나 3중 따옴표 문자열 안에서는 이스케이프를 할 수 없기 때문에 문자열 템플릿의 시작을 표현하는 \$를 3중 따옴표 안에 넣을 수 없다. 넣어야 한다면 문자열 템플릿 안에 '\$' 문자를 넣어야 한다.
 ```kotlin
 val price = """${'$'}99.9"""
 ```

 ## 6. 코드 다듬기: 로컬 함수와 확장
 코틀린에서는 함수에서 추출한 함수를 원 함수 내부에 중첩시킬 수 있다. 그렇게 하면 문법적인 부가 비용을 들이지 않고도 깔끔하게 코드를 조직할 수 있다.

 흔히 발생하는 코드 중복
 ```kotlin

 fun saveUser(user: User) {
   if(user.name.isEmpty()) {
      throw IllegalArgumentException ("Can't save user ${user.id}: empty Name")
   }

   if(user.address.isEmpty()) {
      throw IllegalArgumentException ("Can't save user ${user.id}: empty Address")
   }

   // user를 데이터베이스에 저장한다.
 }
 ```

 로컬 함수를 사용해 코드 중복 줄이기
 ```kotlin
 fun saveUser(user: User) {
   fun validate(user: User, value: String, fieldName: String) {
      if(value.isEmpty()) {
         throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
      }
   }

   validate(user, user.name, "Name") // 로컬 함수를 호출해서
   validate(user, user.address, "Address") // 각 필드를 검증한다.
   // user를 데이터베이스에 저장한다.
 }
 ```

 **로컬 함수는 자신이 속한 바깥 함수의 모든 파라미터와 변수를 사용할 수 있다.** 이 경우 검증 로직은 User를 사용하는 다른 곳에서는 쓰이지 않는 기능이기 때문에 User에 포함시키고 싶지는 않고 간결하게 유지시키기 위해 **검증 로직을 User 클래스를 확장한 함수**로 만들 수도 있다.
 ```kotlin
 fun saveUser(user: User) {
   fun validate(value: String, fieldName: String) { // 이제 saveUser 함수의 user 파라미터를 중복 사용하지 않는다.
      if(value.isEmpty()) {
         throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
      }
   }

   validate(user, user.name, "Name") // 로컬 함수를 호출해서
   validate(user, user.address, "Address") // 각 필드를 검증한다.
   // user를 데이터베이스에 저장한다.
 }
 ```

 반면 한 객체만을 다루면서 객체의 비공개 데이터를 다룰 필요는 없는 함수는 확장 함수로 만들면 객체.멤버처럼 수신 객체를 지정하지 않고도 공개된 멤버 프로퍼티나 메서드에 접근할 수 있다.

 확장 함수를 로컬 함수로 정의할 수도 있다. 즉 User.validateBeforeSave를 saveUser 내부에 로컬 함수로 넣을 수 있다. 하지만 일반적으로는 한 단계만 함수를 중첩시키라고 권장한다.