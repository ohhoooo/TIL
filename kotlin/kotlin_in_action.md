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
4. [클래스, 객체, 인터페이스](#04장-클래스-객체-인터페이스)
   1. [클래스 계층 정의](#1-클래스-계층-정의)
      1. [코틀린 인터페이스](#코틀린-인터페이스)
      2. [open, final, abstract 변경자: 기본적으로 final](#open-final-abstract-변경자-기본적으로-final)
      3. [가시성 변경자: 기본적으로 공개](#가시성-변경자-기본적으로-공개)
      4. [내부 클래스와 중첩된 클래스: 기본적으로 중첩 클래스](#내부-클래스와-중첩된-클래스-기본적으로-중첩-클래스)
      5. [봉인된 클래스: 클래스 계층 정의 시 계층 확장 제한](#봉인된-클래스-클래스-계층-정의-시-계층-확장-제한)
   2. [뻔하지 않은 생성자와 프로퍼티를 갖는 클래스 선언](#2-뻔하지-않은-생성자와-프로퍼티를-갖는-클래스-선언)
      1. [클래스 초기화: 주 생성자와 초기화 블록](#클래스-초기화-주-생성자와-초기화-블록)
      2. [부 생성자: 상위 클래스를 다른 방식으로 초기화](#부-생성자-상위-클래스를-다른-방식으로-초기화)
      3. [인터페이스에 선언된 프로퍼티 구현](#인터페이스에-선언된-프로퍼티-구현)
      4. [게터와 세터에서 뒷받침하는 필드에 접근](#게터와-세터에서-뒷받침하는-필드에-접근)
      5. [접근자의 가시성 변경](#접근자의-가시성-변경)
    3. [컴파일러가 생성한 메서드: 데이터 클래스와 클래스 위임](#3-컴파일러가-생성한-메서드-데이터-클래스와-클래스-위임)
        1. [모든 클래스가 정의해야 하는 메서드](#모든-클래스가-정의해야-하는-메서드)
        2. [데이터 클래스: 모든 클래스가 정의해야 하는 메서드 자동 생성](#데이터-클래스-모든-클래스가-정의해야-하는-메서드-자동-생성)
        3. [클래스 위임: by 키워드 사용](#클래스-위임-by-키워드-사용)
    4. [object 키워드: 클래스 선언과 인스턴스 생성](#4-object-키워드-클래스-선언과-인스턴스-생성)
        1. [객체 선언: 싱글턴을 쉽게 만들기](#객체-선언-싱글턴을-쉽게-만들기)
        2. [동반 객체: 팩토리 메서드와 정적 멤버가 들어갈 장소](#동반-객체-팩토리-메서드와-정적-멤버가-들어갈-장소)
        3. [동반 객체를 일반 객체처럼 사용](#동반-객체를-일반-객체처럼-사용)
        4. [객체 식: 무명 내부 클래스를 다른 방식으로 작성](#객체-식-무명-내부-클래스를-다른-방식으로-작성)
  5. [람다로 프로그래밍](#05장-람다로-프로그래밍)
      1. [람다 식과 멤버 참조](#1-람다-식과-멤버-참조)
          1. [람다 소개: 코드 블록을 함수 인자로 넘기기](#람다-소개-코드-블록을-함수-인자로-넘기기)
          2. [람다와 컬렉션](#람다와-컬렉션)
          3. [람다 식의 문법](#람다식의-문법)
          4. [현재 영역에 있는 변수에 접근](#현재-영역에-있는-변수에-접근)
          5. [멤버 참조](#멤버-참조)
      2. [컬렉션 함수형 API](#2-컬렉션-함수형-api)
          1. [필수적인 함수: filter와 map](#필수적인-함수-filter와-map)
          2. [all, any, count, find: 컬렉션에 술어 적용](#all-any-count-find-컬렉션에-술어-적용)
          3. [groupBy: 리스트를 여러 그룹으로 이뤄진 맵으로 변경](#groupby-리스트를-여러-그룹으로-이뤄진-맵으로-변경)
          4. [flatMap과 flatten: 중첩된 컬렉션 안의 원소 처리](#flatmap과-flatten-중첩된-컬렉션-안의-원소-처리)

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

 * vararg 키워드를 사용하면 호출 시 인자 개수가 달라질 수 있는 함수를 정의할 수 있다.
 * 중위(infix) 함수 호출 구문을 사용하면 인자가 하나뿐인 메서드를 간편하게 호출할 수 있다.
 * 구조 분해 선언을 사용하면 복합적인 값을 분해해서 여러 변수에 나눠 담을 수 있다.
 
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

# 04장 클래스, 객체, 인터페이스

 ## 1. 클래스 계층 정의

 ### 코틀린 인터페이스
 코틀린 인터페이스 안에는 추상 메서드뿐 아니라 구현이 있는 메서드도 정의할 수 있다.(이는 자바 8의 디폴트 메서드와 비슷하다) 다만 인터페이스에는 아무런 상태(필드)도 들어갈 수 없다.

 click이라는 추상 메서드가 있는 인터페이스를 정의하고 구현
 ```kotlin
 interface Clickable {
   fun click()
 }

 class Button : Clickable {
   override fun click() = println("I was clicked")
 }
 >>> Button().click() // I was clicked
 ```

 * 자바에서는 extends와 implements 키워드를 사용하지만, **코틀린에서는 클래스 이름 뒤에 콜론(:)을 붙이고 인터페이스와 클래스 이름을 적는 것으로 클래스 확장과 인터페이스 구현을 모두 처리한다.**
 * 자바와 마찬가지로 클래스는 인터페이스를 원하는 만큼 개수 제한 없이 마음대로 구현할 수 있지만, 클래스는 오직 하나만 확장할 수 있다.
 * 자바의 `@Override` 애노테이션과 비슷한 `override` 변경자는 상위 클래스나 상위 인터페이스에 있는 프로퍼티나 메서드를 오버라이드 한다는 표시다. 하지만 코틀린에서는 **override 변경자를 꼭 사용해야 한다.**

 인터페이스 메서드도 디폴트 구현을 제공할 수 있다. 그런 경우 메서드 앞에 `default`를 붙여야 하는 자바 8와 달리 코틀린에서는 메서드를 특별한 키워드로 꾸밀 필요가 없다. 그냥 메서드 본문을 메서드 시그니처 뒤에 추가하면 된다. 이 인터페이스를 구현하는 클래스는 click에 대한 구현을 제공해야 한다. 반면 showOff 메서드의 경우 새로운 동작을 정의할 수도 있고, 그냥 정의를 생략해서 디폴트 구현을 사용할 수도 있다.
 ```kotlin
 interface Clickable {
   fun click() // 일반 메서드 선언
   fun showOff() = println("I'm clickable!") // 디폴트 구현이 있는 메서드
 }
 ```

 showOff 메서드를 정의하는 다른 인터페이스가 있고, 한 클래스에서 이 두 인터페이스를 함께 구현할 때 **두 상위 인터페이스에 정의된 showOff 구현을 대체할 오버라이딩 메서드를 직접 제공하지 않으면 컴파일러 오류가 발생**한다. 그래서 코틀린 컴파일러는 두 메서드를 아우르는 구현을 하위 클래스에 직접 구현하게 강제한다.
 ```kotlin
 class Button : Clickable, Focusable {
   override fun click() = println("I was clicked")

   override fun showOff() { // 인터페이스를 구현하는 하위클래스에서 명시적으로 새로운 구현을 제공해야 한다.
      super<Clickable>.showOff() // 상위 타입의 이름을 꺾쇠 괄호(<>) 사이에 넣어서 "super"를 지정하면
      super<Focusable>.showOff() // 어떤 상위 타입의 멤버 메서드를 호출할지 지정할 수 있다.
   }
 }
 ```

 ### open, final, abstract 변경자: 기본적으로 final
 자바는 final로 명시적으로 상속을 금지하지 않는 모든 클래스를 다른 클래스가 상속할 수 있다. 이것은 많은 문제가 생긴다. 취약한 기반 클래스라는 문제는 하위 클래스가 기반 클래스에 대해 가졌던 가정이 기반 클래스를 변경함으로써 깨져버린 경우에 생긴다. 어떤 클래스가 자신을 상속하는 방법에 대해 정확한 규칙(어떤 메서드를 어떻게 오버라이드해야 하는지 등)을 제공하지 않는다면 그 클래스의 클라이언트는 기반 클래스를 작성한 사람의 의도와 다른 방식으로 메서드를 오버라이드할 위험이 있다.

 Effective Java에서는 "상속을 위한 설계와 문서를 갖추거나, 그럴 수 없다면 상속을 금지하라"라는 조언을 한다. 이는 특별히 하위 클래스에서 오버라이드하게 의도된 클래스와 메서드가 아니라면 모두 final로 만들라는 뜻이다.

 **자바의 클래스와 메서드는 기본적으로 상속에 대해 열려있지만 코틀린의 클래스와 메서드는 기본적으로 final이다.** 어떤 클래스의 상속을 허용하려면 클래스 앞에 open 변경자를 붙어야 한다. 그와 더불어 오버라이드를 허용하고 싶은 메서드나 프로퍼티의 앞에도 open 변경자를 붙여야 한다.
 ```kotlin
 open class RichButton : Clickable { // 다른 클래스가 상속할 수 있다.

   fun disable() { } // 하위 클래스가 이 메서드를 오버라이드 할 수 없다.

   open fun animate() { } // 하위 클래스에서 이 메서드를 오버라이드해도 된다.

   override fun click() { } // 이 함수는 (상위 클래스에서 선언된) 열려있는 메서드를 오버라이드한다. 오버라이드한 메서드는 기본적으로 열려있다.
 }
 ```

 기반 클래스나 인터페이스의 멤버를 오버라이드하는 경우 그 메서드는 기본적으로 열려있다. 오버라이드하는 메서드의 구현을 하위 클래스에서 오버라이드하지 못하게 금지하려면 오버라이드하는 메서드 앞에 final을 명시해야 한다.
 ```kotlin
 open class RichButton : Cliclable {
   final override fun Click() { } // "final"이 없는 "override" 메서드나 프로퍼티는 기본적으로 열려있다.
 }
 ```

 코틀린에서도 클래스를 abstract로 선언할 수 있다.
 * abstract로 선언한 추상 클래스는 인스턴스화할 수 없다.
 * 추상클래스에는 구현이 없는 추상 멤버가 있기 때문에 하위 클래스에서 그 추상 멤버를 오버라이드해야만 하는 게 보통이다.
 * 추상 멤버는 항상 열려있다. 따라서 추상 멤버 앞에 open 변경자를 명시할 필요가 없다.
 ```kotlin
 abstract class Animated { // 추상클래스이다. 이 클래스의 인스턴스는 만들 수 없다.
   abstract fun animate() // 추상함수다. 이 함수에는 구현이 없다. 하위 클래스에서는 이 함수를 반드시 오버라이드해야 한다.

   open fun stopAnimating() { } // 추상 클래스에 속했더라도 비추상 함수는 기본적으로 파이널이지만

   fun animateTwice() { } // open으로 오버라이드를 허용할 수 있다.
 }
 ```

 인터페이스 멤버의 경우 final, open, abstract를 사용하지 않는다. 인터페이스 멤버는 항상 열려 있으며 final로 변경할 수 없다. 인터페이스 멤버에게 본문이 없으면 자동으로 추상 멤버가 되지만, 그렇더라도 따로 멤버 선언 앞에 abstract 키워드를 덧붙일 필요가 없다.

 변경자 | 이 변경자가 붙은 멤버는... | 설명
 ---|---|---
 final | 오버라이드할 수 없음 | 클래스 멤버의 기본 변경자다.
 open | 오버라이드할 수 있음 | 반드시 open을 명시해야 오버라이드할 수 있다.
 abstract | 반드시 오버라이드해야 함 | 추상 클래스의 멤버에만 이 변경자를 붙일 수 있다. 추상 멤버에는 구현이 있으면 안 된다.
 override | 상위 클래스나 상위 인스턴스의 멤버를 오버라이드하는 중 | 오버라이드하는 멤버는 기본적으로 열려있다. 하위 클래스의 오버라이드를 금지하려면 final을 명시해야 한다.

 ### 가시성 변경자: 기본적으로 공개
 기본적으로 코틀린 가시성 변경자는 자바와 비슷하다. 자바와 같은 public, protected, private 변경자가 있다. 하지만 코틀린의 기본 가시성은 자바와 다르다. 아무 변경자도 없는 경우 선언은 모두 공개(public)된다.

 자바의 기본 가시성인 패키지 전용(package-private)은 코틀린에 없다. 코틀린은 패키지를 네임스페이스를 관리하기 위한 용도로만 사용한다. 그래서 패키지를 가시성 제어에 사용하지 않는다.

 모듈은 한 번에 한꺼번에 컴파일되는 코틀린 파일들을 의미한다. 인텔리J나 이클립스, 메이븐, 그레이들 등의 프로젝트가 모듈이 될 수 있고, 앤트 태스크가 한 번 실행될 때 함께 컴파일되는 파일의 집합도 모듈이 될 수 있다.

 변경자 | 클래스 멤버 | 최상위 선언
 ---|---|---
 public | 모든 곳에서 볼 수 있다. | 모든 곳에서 볼 수 있다.
 internal | 같은 모듈 안에서만 볼 수 있다. | 같은 모듈 안에서만 볼 수 있다.
 protected | 하위 클래스 안에서만 볼 수 있다. | (최상위 선언에 적용할 수 없음)
 private | 같은 클래스 안에서만 볼 수 있다. | 같은 파일 안에서만 볼 수 있다.

 코틀린은 public 함수인 giveSpeech 안에서 그보다 가시성이 더 낮은(이 경우 internal) 타입인 TalkativeButton을 참조하지 못하게 하낟. 이는 어떤 클래스의 기반 타입 목록에 들어있는 타입이나 제네릭 클래스의 타입 파라미터에 들어있는 타입의 가시성은 그 클래스 자신의 가시성과 같거나 더 높아야 하고, 메서드의 시그니처에 사용된 모든 타입의 가시성은 그 메서드의 가시성과 같거나 더 높아야 한다는 더 일반적인 규칙에 해당한다.
 ```kotlin
 internal open class TalkativeButton : Focusable {
   private fun yell() = println("Hey!")
   protected fun whisper() = println("Let's talk!")
 }

 fun TalkativeButton.giveSpeech() { // 오류: "public" 멤버가 자신의 "internal" 수신 타입인 "TalkativeButton"을 노출함
   yell() // 오류: "yell"에 접근할 수 없음: "yell"은 "TalkativeButton"의 "private" 멤버임
   whisper() // 오류: "whisper"에 접근할 수 없음: "whisper"는 "TalkativeButton"의 "protected" 멤버임
 }
 ```

 ### 내부 클래스와 중첩된 클래스: 기본적으로 중첩 클래스
 자바처럼 코틀린에서도 클래스 안에 다른 클래스를 선언할 수 있다. 클래스 안에 다른 클래스를 선언하면 도우미 클래스를 캡슐화하거나 코드 정의를 그 코드를 사용하는 곳 가까이에 두고 싶을 때 유용하다. 자바와의 차이는 코틀린의 중첩 클래스는 명시적으로 요청하지 않는 한 바깥쪽 클래스 인스턴스에 대한 접근 권한이 없다는 점이다.

 ```kotlin
 interface State: Serializable
 
 interface View {
   fun getCurrentState() : State
   fun restoreState(state: State) { }
 }
 ```
 
 Button 클래스의 상태를 저장하는 클래스는 Button 클래스 내부에 선언하면 편하다. 자바에서 그런 선언하는 코드는 아래와 같다.
 ```java
 public class Button implements View {
   @Override
   public State getCurrentState() {
      return new ButtonState();
   }

   @Override
   public void restoreState(State state) { ... }

   public class ButtonState implements State { ... }
 }
 ```
 선언한 버튼의 상태를 직렬화하면 java.io.NotSerializableException: Button이라는 오류가 발생한다. 자바에서 다른 클래스 안에 정의한 클래스는 자동으로 내부 클래스가 된다. 이 예제의 ButtonState 클래스는 바깥쪽 Button 클래스에 대한 참조를 묵시적으로 포함한다. 그 참조로 인해 ButtonState를 직렬화할 수 없다. Button을 직렬화할 수 없으므로 버튼에 대한 참조가 ButtonState의 직렬화를 방해한다.

 이 문제를 해결하려면 ButtonState를 static 클래스로 선언해야 한다. 자바에서 중첩 클래스를 static으로 선언하면 그 클래스를 둘러싼 바깥쪽 클래스에 대한 묵시적인 참조가 사라진다.

 코틀린에서 중첩된 클래스가 기본적으로 동작하는 방식은 방금 설명한 것과 정반대다.
 ```kotlin
 class Button : View {
   override fun getCurrentState() : State = ButtonState()

   override fun restoreState(state: State) { ... }

   class ButtonState : State { ... } // 이 클래스는 자바의 정적 중첩 클래스와 대응한다.
 }
 ```
 
 클래스 B 안에 정의된 클래스 A | 자바에서는 | 코틀린에서는
 ---|---|---
 중첩 클래스(바깥쪽 클래스에 대한 참조를 저장하지 않음) | static class A | class A
 내부 클래스(바깥쪽 클래스에 대한 참조를 저장함) | class A | inner class A

 코틀린에서 바깥쪽 클래스의 인스턴스를 가리키는 참조를 표기하는 방법도 자바와 다르다. 내부 클래스 Inner 안에서 바깥쪽 클래스 Outer의 참조에 접근하려면 this@Outer라고 써야 한다.
 ```kotlin
 class Outer {
   inner class Inner {
      fun getOuterReference() : Outer = this@Outer
   }
 }
 ```

 ### 봉인된 클래스: 클래스 계층 정의 시 계층 확장 제한
 코틀린 컴파일러는 when을 사용해 Expr 타입의 값을 검사할 때 꼭 디폴트 분기인 else분기를 덧붙이게 강제한다. 
 
 이 예제의 else 분기에서는 반환할 만한 의미 있는 값이 없으므로 예외를 던진다. 항상 디폴트 분기를 추가하는 게 편하지도 않고 이런 클래스 계층에 새로운 하위클래스를 추가하더라도 컴파일러가 when이 모든 경우를 처리하는지 제대로 검사할 수 없기 때문에 경우에 따라서 심각한 버그가 발생할 수 있다.
 ```kotlin
 interface Expr
 class Num(val value: Int) : Expr
 class Sum(val left: Expr, val right: Expr) : Expr

 fun eval(e: Expr) : Int =
   when(e) {
      is Num -> e.value
      is Sum -> eval(e.right) + eval(e.left)
      else -> // "else" 분기가 꼭 있어야 한다.
         throw IllegalArgumentException("Unknown expression")
   }
 ```
 
 코틀린은 이런 문제에 대한 해법으로 sealed 클래스를 제공한다. 상위 클래스에 sealed 변경자를 붙이면 그 상위 클래스를 상속한 하위 클래스 정의를 제한할 수 있다. sealed 클래스의 하위 클래스를 정의할 때는 반드시 상위 클래스 안에 중첩시켜야 한다.
 ```kotlin
 sealed class Expr { // 기반 클래스를 sealed로 봉인한다.
   class Num(val value: Int) : Expr() // 기반 클래스의 모든 하위 클래스를
   class Sum(val left: Expr, val right: Expr) : Expr() // 중첩 클래스로 나열한다.
 }

 fun eval(e: Expr): Int =
   when(e) {
      is Expr.Num -> e.value
      is Expr.Sum -> eval(e.right) + eval(e.left)
   }
 ```
 * when 식에서 sealed 클래스의 모든 하위 클래스를 처리한다면 디폴트 분기(else 분기)가 필요 없다.
 * sealed로 표시된 클래스는 자동으로 open이다.
 * 내부적으로 Expr 클래스는 private 생성자를 가진다.

 ## 2. 뻔하지 않은 생성자와 프로퍼티를 갖는 클래스 선언
 자바에서는 생성자를 하나 이상 선언할 수 있다. 코틀린은 주(primary) 생성자(보통 주 생성자는 클래스를 초기화할 때 주로 사용하는 간략한 생성자로, 클래스 본문 밖에서 정의한다)와 부(secondary) 생성자(클래스 본문 안에서 정의한다)를 구분한다. 또한 코틀린에서는 초기화 블록을 통해 초기화 로직을 추가할 수 있다. 

 ### 클래스 초기화: 주 생성자와 초기화 블록
 클래스 이름 뒤에 오는 괄호로 둘러싸인 코드를 **주 생성자**라고 부른다.

 * constructor 키워드는 주 생성자나 부 생성자 정의를 시작할 때 사용한다.
 * init 키워드는 초기화 블록을 시작한다. 초기화 블록에는 클래스의 객체가 만들어질 때(인스턴스화될 때) 실행될 초기화 코드가 들어간다. 초기화 블록은 주 생성자와 함께 사용된다. 주 생성자는 제한적이기 때문에 별도의 코드를 포함할 수 없으므로 초기화 블록이 필요하다. 필요하다면 클래스 안에 여러 초기화 블록을 선언할 수 있다.
 ```kotlin
 // 가장 묵시적인 선언
 class User(val nickname: String)

 // 가장 명시적인 선언
 class User constructor(_nickname: String) { // 파라미터가 하나만 있는 주 생성자
   val nickname: String

   init { // 초기화 블록
      nickname = _nickname
   }
 }
 ```

 이 예제에서는 nickname 프로퍼티를 초기화하는 코드를 nickname 프로퍼티 선언에 포함시킬 수 있어서 초기화 코드를 초기화 블록에 넣을 필요가 없다. 또 주 생성자 앞에 별다른 애노테이션이나 가시성 변경자가 없다면 constructor를 생략해도 된다.
 ```kotlin
 class User(_nickname: String) { // 파라미터가 하나뿐인 주 생성자
   val nickname = _nickname // 프로퍼티를 주 생성자의 파라미터로 초기화한다.
 }
 ```

 하지만 주 생성자의 파라미터로 프로퍼티를 초기화한다면 그 주 생성자 파라미터 이름 앞에 val을 추가하는 방식으로 프로퍼티 정의와 초기화를 간략히 쓸 수 있다.
 ```kotlin
 class User(val nickname: String) // "val"은 이 파라미터에 상응하는 프로퍼티가 생성된다는 뜻이다.

 class User(val nickname: String, val isSubscribed: Boolean = true) // 생성자 파라미터에 대한 디폴트 값을 제공한다.

 >>> val hyun = User("현석") // isSubscribed 파라미터에는 디폴드 값이 쓰인다.
 >>> println(hyun.isSubscribed) // true

 >>> val gye = User("계영", false) // 모든 인자를 파라미터 선언 순서대로 지정할 수도 있다.
 >>> println(gye.isSubscribed) // false

 >>> val hey = User("혜원", isSubscribed = false) // 생성자 인자 중 일부에 대해 이름을 지정할 수도 있다.
 >>> println(hey.isSubscribed) // false
 ```

 클래스에 기반 클래스가 있다면 주 생성자에서 기반 클래스의 생성자를 호출해야 할 필요가 있다. 기반 클래스를 초기화하려면 기반 클래스 이름 뒤에 괄호를 치고 생성자 인자를 넘긴다.
 ```kotlin
 open class User(val nickname: String) { ... }
 class TwitterUser(nickname: String) : User(nickname) { ... }
 ```

 클래스를 정의할 때 별도로 생성자를 정의하지 않으면 컴파일러가 자동으로 아무 일도 하지 않는 인자가 없는 디폴트 생성자를 만들어준다.
 ```kotlin
 open class Button // 인자가 없는 디폴트 생성자가 만들어진다.
 ```

 Button의 생성자는 아무 인자도 받지 않지만, Button 클래스를 상속한 하위 클래스는 반드시 Button 클래스의 생성자를 호출해야 한다.
 ```kotlin
 class RadioButton : Button()
 ```

 이 규칙으로 인해 기반 클래스의 이름 뒤에는 꼭 빈 괄호가 들어간다. 반면 인터페이스는 생성자가 없기 때문에 어떤 클래스가 인터페이스를 구현하는 경우 그 클래스의 상위 클래스 목록에 있는 인터페이스 이름 뒤에는 아무 괄호도 없다. 클래스 정의에 있는 상위 클래스 및 인터페이스 목록에서 이름 뒤에 괄호가 붙었는지 살펴보면 쉽게 기반 클래스와 인터페이스를 구별할 수 있다.

 어떤 클래스를 클래스 외부에서 인스턴스화하지 못하게 막고 싶다면 모든 생성자를 private으로 만들면 된다. Secretive 클래스 안에는 주 생성자밖에 없고 그 주 생성자는 비공개이므로 외부에서는 Secretive를 인스턴스화할 수 없다.
 ```kotlin
 class Secretive private constructor() { } // 이 클래스의 (유일한) 주 생성자는 비공개다.
 ```

 ### 부 생성자: 상위 클래스를 다른 방식으로 초기화
 자바에서 선언된 생성자가 2개인 View 클래스가 있다고 할 때, 그 클래스를 코틀린으로는 다음과 비슷하게 정의할 수 있다. 이 클래스는 주 생성자를 선언하지 않고(클래스 헤더에 있는 클래스 이름 뒤에 괄호가 없다), 부 생성자만 2가지 선언한다. 부 생성자는 constructor 키워드로 시작한다.
 ```kotlin
 open class View {
   constructor(ctx: Context) { ... } // 부 생성자
   constructor(ctx: Context, attr: AttributeSet) { ... } // 부 생성자
 }
 ```

 클래스를 확장하면서 똑같이 부 생성자를 정의할 수 있다. 여기서 두 부 생성자는 super() 키워드를 통해 자신에 대응하는 상위 클래스 생성자를 호출한다.
 ```kotlin
 class MyButton : View {
   constructor(ctx: Context) : super(ctx) { ... } // 상위 클래스의
   constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) { ... } // 생성자를 호출한다.
 }
 ```

 자바와 마찬가지로 생성자에서 this()를 통해 클래스 자신의 다른 생성자를 호출할 수 있다.
 ```kotlin
 class MyButton : View {
   constructor(ctx: Context) : this(ctx, MY_STYLE) { ... }
   constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) { ... }
 }
 ```

 클래스에 주 생성자가 없다면 모든 부 생성자는 반드시 상위 클래스를 초기화하거나 다른 생성자에게 생성을 위임해야 한다. 각 부 생성자에서 객체 생성을 위임하는 화살표를 따라가면 그 끝에서는 상위 클래스 생성자를 호출해야 한다.

 ### 인터페이스에 선언된 프로퍼티 구현
 코틀린에서는 인터페이스에 추상 프로퍼티 선언을 넣을 수 있다.
 ```kotlin
 interface User {
  val nickname: String
 }
 ```

 이는 User 인터페이스를 구현하는 클래스가 nickname의 값을 얻을 수 있는 방법을 제공해야 한다는 뜻이다. 인터페이스에 있는 프로퍼티 선언에는 뒷받침하는 필드나 게터 등의 정보가 들어있지 않다. 인터페이스는 아무 상태도 포함할 수 없으므로 상태를 저장할 필요가 있다면 인터페이스를 구현한 하위 클래스에서 상태 저장을 위한 프로퍼티 등을 만들어야 한다.
 ```kotlin
 class PrivateUser(override val nickname: String) : User // 주 생성자에 있는 프로퍼티

 class SubscribingUser(val email: String) : User {
  override val nickname: String
    get() = email.substringBefore('@') // 커스텀 게터
 }

 class FacebookUser(val accountId: Int) : User {
  override val nickname = getFacebookName(accountId) // 프로퍼티 초기화 식
 }

 >>> println(PrivateUser("test@kotlinlang.org").nickname) // test@kotlinlang.org
 >>> println(SubscribingUser("test@kotlinlang.org").nickname) // test
 ```
 
 인터페이스에는 추상 프로퍼티뿐 아니라 게터와 세터가 있는 프로퍼티를 선언할 수도 있다. 물론 그런 게터와 세터는 뒷받침하는 필드를 참조할 수 없다. 추상 프로퍼티인 email을 반드시 오버라이드해야 한다. 반면 nickname은 오버라이드 하지 않고 상속할 수 있다.
 ```kotlin
 interface User {
  val email: String
  val nickname: String
    get() = email.substringBefore('@') // 프로퍼티에 뒷받침하는 필드가 없다. 대신 매번 결과를 계산해 돌려준다.(커스텀 게터)
 }
 ```

 ### 게터와 세터에서 뒷받침하는 필드에 접근
 프로퍼티의 두 가지 유형(값을 저장하는 프로퍼티와 커스텀 접근자에서 매번 값을 계산 하는 프로퍼티)를 조합해서 어떤 값을 저장하되 그 값을 변경하거나 읽을 때마다 정해진 로직을 실행하는 유형의 프로퍼티를 만드는 방법에 대한 예시 코드이다. 커스텀 세터를 정의해서 추가 로직을 실행한다.
 ```kotlin
 class User(val name: String) {
  var address: String = "unspecified"
    set(value: String) {
      println("""
        Address was changed for $name:
        "$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드 값 읽기
      field = value // 뒷받침하는 필드 값 변경하기
    }
 }
 >>> val user = User("Alice")
 >>> user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
 Address was changed for Alice: "unspecified" -> "Elsenheimerstrasse 47, 80687 Muenchen"
 ```
 접근자의 본문에서는 field라는 특별한 식별자를 통해 뒷받침하는 필드에 접근할 수 있다.

 뒷받침하는 필드가 있는 프로퍼티와 그런 필드가 없는 프로퍼티는 클래스의 프로퍼티를 사용하는 쪽에서 프로퍼티를 읽는 방법이나 쓰는 방법은 뒷받침하는 필드의 유무와는 관계가 없다. 컴파일러는 디폴드 접근자 구현을 사용하건 직접 게터나 세터를 정의하건 관계없이 게터나 세터에서 field를 사용하는 프로퍼티에 대해 뒷받침하는 필드를 생성해준다. 다만 field를 사용하지 않는 커스텀 접근자 구현을 정의한다면 뒷받침하는 필드는 존재하지 않는다.

 ### 접근자의 가시성 변경
 접근자의 가시성은 기본적으로는 프로퍼티의 가시성과 같다. 하지만 원한다면 get이나 set 앞에 가시성 변경자를 추가해서 접근자의 가시성을 변경할 수 있다.
 ```kotlin
 class LengthCounter {
  var counter: Int = 0
    private set // 이 클래스 밖에서 이 프로퍼티의 값을 바꿀 수 없다.

  fun addWord(word: String) {
    counter += word.length
  }
 }
 >>> val lengthCounter = LengthCounter()
 >>> lengthCounter.addWord("Hi!")
 >>> println(lengthCounter.counter) // 3
 ```

 ## 3. 컴파일러가 생성한 메서드: 데이터 클래스와 클래스 위임
 
 ### 모든 클래스가 정의해야 하는 메서드
 자바와 마찬가지로 코틀린 클래스도 toString, equals, hashCode 등을 오버라이드 할 수 있다. 코틀린은 이런 메서드 구현을 자동으로 생성해줄 수 있다.

 #### 문자열 표현: toString()

 : 기본 제공되는 객체의 문자열 표현은 Client@5e9f23b4 같은 방식인데, 이는 그다지 유용하지 않다. 이 기본 구현을 바꾸려면 toString 메서드를 오버라이드해야 한다.

 #### 객체의 동등성: equals()

 : 자바에서의 ==는 원시 타입일 경우 두 피연산자의 값이 같은지 비교한다(동등성). 반면 참조 타입일 경우 두 피연산자의 주소가 같은지를 비교한다. 따라서 자바에서는 두 객체의 동등성을 알려면 equals를 호출해야 한다. 코틀린에서는 == 연산자가 두 객체를 비교하는 기본적인 방법이다. == 는 내부적으로 equals를 호출해서 객체를 비교한다. 따라서 클래스가 equals를 오버라이드하면 == 를 통해 안전하게 그 클래스의 인스턴스를 비교할 수 있다. 참조 비교를 위해서는 === 연산자를 사용할 수 있다.

 #### 해시 컨테이너: hashCode()

 : 자바에서는 equals를 오버라이드할 때 반드시 hashCode도 함께 오버라이드해야 한다. JVM 언어에서는 hashCode가 지켜야 하는 "equals()가 true를 반환하는 두 객체는 반드시 같은 hashCode()를 반환해야 한다."라는 제약이 있다.
 
 ```kotlin
 class Client(val name: String, val postalCode: Int) {
  override fun toString() = "Client(name=$name, postalCode=$postalCode)"

  override fun equals(other: Any?) : Boolean {
    if (other == null || other !is Client)
      return false
    return name == other.name && postalCode == other.postalCode
  }

  override fun hashCode() : Int = name.hashCode() * 31 + postalCode
 }
 >>> val client1 = Client("오현석", 4122)
 >>> println(client1) // Client(name=오현석, postalCode=4122)
 ```

 코틀린 컴파일러는 이 모든 메서드를 자동으로 생성해줄 수 있다.

 ### 데이터 클래스: 모든 클래스가 정의해야 하는 메서드 자동 생성
 어떤 클래스가 데이터를 저장하는 역할만을 수행한다면 toString, equals, hashCode를 반드시 오버라이드해야 한다. 다행이 IDE는 자동으로 그런 메서드를 정의해준다. 코틀린에서는 data라는 변경자를 클래스 앞에 붙이면 필요한 메서드를 컴파일러가 자동으로 만들어준다. data 변경자가 붙은 클래스를 데이터 클래스라고 부른다.
 ```kotlin
 data class Client(val name: String, val postalCode: Int)
 ```
 data class는 자바에서 요구하는 모든 메서드를 포함한다.
 * 인스턴스 간 비교를 위한 equals
 * HashMap과 같은 해시 기반 컨테이너에서 키로 사용할 수 있는 hashCode
 * 클래스의 각 필드를 선언 순서대로 표시하는 문자열 표현을 만들어주는 toString

 코틀린 컴파일러는 data 클래스에게 방금 말한 세 메서드뿐 아니라 몇 가지 유용한 메서드를 더 생성해준다. 하나는 바로 밑에서 설명하고 나머지 하나는 구조 분해 선언인데 이것은 뒤에서 설명한다.

 #### 데이터 클래스와 불변성: copy() 메서드
 데이터 클래스의 프로퍼티가 꼭 val일 필요는 없다. 원한다면 var 프로퍼티를 써도 된다. 하지만 데이터 클래스의 모든 프로퍼티를 읽기 전용으로 만들어서 데이터 클래스를 불변 클래스로 만들라고 권장한다.

 데이터 클래스 인스턴스를 불변 객체로 더 쉽게 활용할 수 있게 코틀린 컴파일러는 객체를 복사하면서 일부 프로퍼티를 바꿀 수 있게 해주는 copy 메서드를 제공한다.

 ### 클래스 위임: by 키워드 사용
 하위 클래스가 상위 클래스의 메서드 중 일부를 오버라이드 하면 하위 클래스는 상위 클래스의 세부 구현 사항에 의존하게 된다. 시스템이 변함에 따라 상위 클래스의 구현이 바뀌거나 상위 클래스에 새로운 메서드가 추가된다. 그 과정에서 하위 클래스가 상위 클래스에 대해 갖고 있던 가정이 깨져서 코드가 정상적으로 작동하지 못하는 경우가 생길 수 있다. 그래서 코틀린을 설계할 때 기본적으로 클래스를 final로 취급하기로 설계했다.
 
 하지만 종종 상속을 허용하지 않는 클래스에 새로운 동작을 추가해야 할 때가 있다. 이럴 때 사용하는 일반적인 방법이 **데코레이터(Decorator) 패턴**이다. 이 패턴의 핵심은 **상속을 허용하지 않는 클래스(기존 클래스) 대신 사용할 수 있는 새로운 클래스(데코레이터)를 만들되 기존 클래스와 같은 인터페이스를 데코레이터가 제공하게 만들고, 기존 클래스를 데코레이터 내부에 필드로 유지하는 것이다. 이때 새로 정의해야 하는 기능은 데코레이터의 메서드에 새로 정의하고(물론 이때 기존 클래스의 메서드나 필드를 활용할 수도 있다) 기존 기능이 그대로 필요한 부분은 데코레이터의 메서드가 기존 클래스의 메서드에게 요청을 전달한다.**

 이런 접근 방법의 단점은 준비 코드가 상당히 많이 필요하다는 점이다. 예를 들어 Collection 같이 비교적 단순한 인터페이스를 구현하면서 아무 동작도 변경하지 않는 데코레이터를 만들 때조차도 다음과 같이 복잡한 코드를 사용해야 한다.
 ```kotlin
 class DelegatingCollection<T> : Collection<T> {
  private val innerList = arrayListOf<T>()

  override val size: Int get() = innerList.size
  override fun isEmpty() : Boolean = innerList.isEmpty()
  override fun contains(element: T) : Boolean = innerList.contains(element)
  override fun iterator() : Iterator<T> = innerList.iterator()
  override fun containsAll(elements: Collection<T>) : Boolean = innerList.containsAll(elements)
 }
 ```

 이러한 위임을 언어가 제공하는 일급 시민 기능으로 지원한다. 인터페이스를 구현할 때 by 키워드를 통해 그 인터페이스에 대한 구현을 다른 객체에 위임 중이라는 사실을 명시할 수 있다.
 ```kotlin
 class DelegatingCollection<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList {}
 ```

 메서드 중 일부의 동작을 변경하고 싶은 경우 메서드를 오버라이드하면 컴파일러가 생성한 메서드 대신 오버라이드한 메서드가 쓰인다. 기존 클래스의 메서드에 위임하는 기본 구현으로 충분한 메서드는 따로 오버라이드할 필요가 없다.
 ```kotlin
 class CountingSet<T>(
  val innerSet: MutableCollection<T> = HashSet<T>()
 ) : MutableCollection<T> by innerSet { // MutableCollection의 구현을 innerSet에게 위임한다.
  var objectsAdded = 0

  override fun add(element: T): Boolean { // 이 두 메서드는 위임하지 않고
    objectsAdded++
    return innerSet.add(element)
  }

  override fun addAll(c: Collection<T>): Boolean { // 새로운 구현을 제공한다.
    objectAdded += c.size
    return innerSet.addAll(c)
  }
 }
 >>> val cset = CountingSet<Int>()
 >>> cset.addAll(listOf(1, 1, 2))
 >>> println("${cset.objectsAdded} objects were added, ${cset.size} remain") // 3 objects were added, 2 remain
 ```

 ## 4. object 키워드: 클래스 선언과 인스턴스 생성
 코틀린에서는 object 키워드를 다양한 상황에서 사용하지만 모든 경우 클래스를 정의 하면서 동시에 인스턴스(객체)를 생성한다는 공통점이 있다.
 * 객체 선언은 싱글턴을 정의하는 방법 중 하나다.
 * 동반 객체는 인스턴스 메서드는 아니지만 어떤 클래스와 관련 있는 메서드와 팩토리 메서드를 담을 때 쓰인다. 동반 객체 메서드에 접근할 때는 동반 객체 포함된 클래스의 이름을 사용할 수 있다.
 * 객체 식은 자바의 무명 내부 클래스 대신 쓰인다.

 ### 객체 선언: 싱글턴을 쉽게 만들기
 코틀린은 **객체 선언** 기능을 통해 싱글턴을 언어에서 기본 지원한다. 객체 선언은 클래스 선언과 그 클래스에 속한 **단일 인스턴스**의 선언을 합친 선언이다.
 ```kotlin
 object Payroll {
  val allEmployees = arrayListOf<Person>()

  fun calculateSalary() {
    for(person in allEmployees) { ... }
  }
 }
 ```
 객체 선언은 object 키워드로 시작한다. 객체 선언은 클래스를 정의하고 그 클래스의 인스턴스를 만들어서 변수에 저장하는 모든 작업을 단 한 문장으로 처리한다. 클래스와 마찬가지로 객체 선언 안에도 프로퍼티, 메서드, 초기화 블록 등이 들어갈 수 있다. 하지만 생성자는(주 생성자와 부 생성자 모두) 객체 선언에 쓸 수 없다. 일반 클래스 인스턴스와 달리 싱글턴 객체는 객체 선언문이 있는 위치에서 생성자 호출 없이 즉시 만들어진다. 따라서 객체 선언에는 생성자 정의가 필요 없다.

 변수와 마찬가지로 객체 선언에 사용한 이름 뒤에 마침표(.)를 붙이면 객체에 속한 메서드나 프로퍼티에 접근할 수 있다.
 ```kotlin
 Payroll.allEmployees.add(Person(...))
 Payroll.calculateSalary()
 ```

 객체 선언도 클래스나 인터페이스를 상속할 수 있다. 예시로 java.util.Comparator 인터페이스에서 Comparator 안에는 데이터를 저장할 필요가 없다. 따라서 어떤 클래스에 속한 객체를 비교할 때 사용하는 Comparator는 보통 클래스마다 단 하나씩만 있으면 된다. 따라서 Comparator 인스턴스를 만드는 방법으로는 객체 선언이 가장 좋은 방법이다.
 ```kotlin
 object CaseInsensitiveFileComparator : Comparator<File> {
  override fun compare(file1: File, file2: File): Int {
    return file1.path.compareTo(file2.path, ignoreCase = true)
  }
 }
 >>> println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user"))) // 0
 ```

 일반 객체(클래스의 인스턴스)를 사용할 수 있는 곳에서는 항상 싱글턴 객체를 사용할 수 있다. 예를 들어 이 객체를 Comparator를 인자로 받는 함수에게 인자로 넘길 수 있다.
 ```kotlin
 >>> val files = listOf(File("/Z"), File("/a"))
 >>> println(files.sortedWith(CaseInsensitiveFileComparator)) // [/a, /Z]
 ```

 클래스 안에서 객체를 선언할 수도 있다. 그런 객체도 인스턴스는 단 하나뿐이다(바깥 클래스의 인스턴스마다 중첩 객체 선언에 해당하는 인스턴스가 하나씩 따로 생기는 것이 아니다). 예를 들어 어떤 클래스의 인스턴스를 비교하는 Comparator를 클래스 내부에 정의하는게 더 바람직하다.
 ```kotlin
 data class Person(val name: String) {
  object NameComparator : Comparator<Person> {
    override fun compare(p1: Person, p2: Person): Int = p1.name.compareTo(p2.name)
  }
 }
 >>> val persons = listOf(Person("Bob"), Person("Alice"))
 >>> println(persons.sortedWith(Person.NameComparator)) // [Person(name=Alice), Person(name=Bob)]
 ```

 ### 동반 객체: 팩토리 메서드와 정적 멤버가 들어갈 장소
 코틀린 클래스 안에는 정적인 멤버가 없다. 코틀린 언어는 자바 static 키워드를 지원하지 않는다. 그 대신 코틀린에서는 패키지 수준의 최상위 함수(자바의 정적 메서드 역할을 거의 대신 할 수 있다)와 객체 선언(자바의 정적 메서드 역할 중 코틀린 최상위 함수가 대신할 수 없는 역할이나 정적 필드를 대신할 수 있다)을 활용한다. 대부분의 경우 최상위 함수를 활용하는 편을 더 권장한다. 하지만 최상위 함수는 private으로 표시된 클래스 비공개 멤버에 접근할 수 없다. 그래서 클래스의 인스턴스와 관계없이 호출해야 하지만, 클래스 내부 정보에 접근해야 하는 함수가 필요할 때는 클래스에 중첩된 객체 선언의 멤버 함수로 정의해야 한다. 그런 함수의 대표적인 예로 팩토리 메서드를 들 수 있다.

 클래스 안에 정의된 객체 중 하나에 `companion`이라는 특별한 표시를 붙이면 그 클래스의 동반 객체로 만들 수 있다. 동반 객체의 프로퍼티나 메서드에 접근하려면 그 동반 객체가 정의된 클래스 이름을 사용한다. 이때 객체의 이름을 따로 지정할 필요가 없다. 그 결과 **동반 객체의 멤버를 사용하는 구문은 자바의 정적 메서드 호출이나 정적 필드 사용 구문과 같아진다.**
 ```kotlin
 class A {
  companion object {
    fun bar() {
      println("Companion object called")
    }
  }
 }
 >>> A.bar() // Companion object called
 ```

 동반 객체는 자신을 둘러싼 클래스의 모든 private 멤버에 접근할 수 있다. 따라서 동반 객체는 private 생성자를 호출하기 좋은 위치다. 따라서 동반 객체는 **팩토리 패턴**을 구현하기 가장 적합한 위치다.

 부 생성자가 2개 있는 클래스의 예시와 그 클래스를 동반 객체 안에서 팩토리 클래스를 정의하는 예시이다.
 ```kotlin
 class User {
  val nickname: String

  constructor(email: String) {
    nickname = email.substringBefore('@')
  }

  constructor(facebookAccountId: Int) {
    nickname = getFacebookName(facebookAccountId)
  }
 }
 ```

 아래의 예시 구현에서는 생성자를 통해 User 인스턴스를 만들 수 없고 팩토리 메서드를 통해야만 한다.
 ```kotlin
 class User private constructor(val nickname: String) { // 주 생성자를 비공개로 만든다.
  companion object { // 동반 객체를 선언한다.
    fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
    fun newFacebookUser(accountId: Int) = // 페이스북 사용자 ID로 사용자를 만드는 팩토리 메서드
      User(getFacebookName(accountId))
  }
 }
 >>> val subscribingUser = User.newSubscribingUser("bob@gmail.com")
 >>> val facebookUser = User.newFacebookUser(4)
 >>> println(subscribingUser.nickname) // bob
 ```

 팩토리 메서드는 매우 유용하다.
 * 목적에 따라 팩토리 메서드 이름을 정할 수 있다.
 * 팩토리 메서드가 선언된 클래스의 하위 클래스 객체를 반환할 수도 있다.
 * 팩토리 메서드는 생성할 필요가 없는 객체를 생성하지 않을 수도 있다. 예를 들어 이메일 주소별로 유일한 User 인스턴스를 만드는 경우 팩토리 메서드가 이미 존재하는 인스턴스에 해당하는 이메일 주소를 전달받으면 새 인스턴스를 만들지 않고 캐시에 있는 기존 인스턴스를 반환할 수 있다.

 하지만 클래스를 확장해야만 하는 경우에는 동반 객체 멤버를 하위 클래스에서 오버라이드 할 수 없으므로 여러 생성자를 사용하는 편이 더 나은 해법이다.

 ### 동반 객체를 일반 객체처럼 사용
 동반 객체는 클래스 안에 정의된 일반 객체다. 따라서 동반 객체에 이름을 붙이거나, 동반 객체가 인터페이스를 상속하거나, 동반 객체 안에 확장 함수와 프로퍼티를 정의할 수 있다.
 ```kotlin
 class Person(val name: String) {
  companion object Loader { // 동반 객체에 이름을 붙인다.
    fun fromJSON(jsonText: String): Person = ...
  }
 }
 >>> person = Person.Loader.fromJSON("{name: 'Dmitry'}")
 >>> person.name // Dmitry
 >>> person2 = Person.fromJSON("{name: 'Brent'}")
 >>> person2.name // Brent
 ```

 #### 동반 객체에서 인터페이스 구현
 인터페이스를 구현하는 동반 객체를 참조할 때 객체를 둘러싼 클래스의 이름을 바로 사용할 수 있다.
 ```kotlin
 interface JSONFactory<T> {
  fun fromJSON(jsonText: String): T
 }

 class Person(val name: String) {
  companion object : JSONFactory<Person> {
    override fun fromJSON(jsonText: String): Person = ... // 동반 객체가 인터페이스를 구현한다.
  }
 }
 ```

 JSON으로부터 각 원소를 다시 만들어내는 추상 팩토리가 있다면 Person 객체를 그 팩토리에게 넘길 수 있다.
 ```kotlin
 fun loadFromJSON<T>(factory: JSONFactory<T>): T {
  ...
 }
 loadFromJSON(Person) // 동반 객체의 인스턴스를 함수에 넘긴다.
 ```

 #### 동반 객체 확장
 Person 클래스는 핵심 비즈니스 로직 모듈의 일부다. 하지만 그 비즈니스 모듈이 특정 데이터 타입에 의존하기를 원치는 않는다. 따라서 역직렬화 함수를 비즈니스 모듈이 아니라 클라이언트/서버 통신을 담당하는 모듈 안에 포함시키고 싶다. 확장 함수를 사용하면 이렇게 구조를 잡을 수 있다.
 ```kotlin
 // 비즈니스 로직 모듈
 class Person(val firstName: String, val lastName: String) {
  companion object { } // 비어있는 동반 객체를 선언한다.
 }

 // 클라이언트/서버 통신 모듈
 fun Person.Companion.fromJSON(json: String) : Person { // 확장 함수를 선언한다.
  ...
 }
 >>> val p = Person.fromJSON(json)
 ```
 마치 동반 객체 안에서 fromJSON 함수를 정의한 것처럼 fromJSON을 호출할 수 있다. 여기서 동반 객체에 대한 확장 함수를 작성할 수 있으려면 원래 클래스에 동반 객체를 꼭 선언해야 한다.

 ### 객체 식: 무명 내부 클래스를 다른 방식으로 작성
 object 키워드를 싱글턴과 같은 객체를 정의하고 그 객체에 이름을 붙일 때만 사용하지는 않는다. 무명 객체를 정의할 때도 object 키워드를 쓴다. 무명 객체는 자바의 무명 내부 클래스를 대신한다. 다음 예시는 자바에서 흔히 무명 내부 클래스로 구현하는 이벤트 리스너를 코틀린으로 구현한 코드이다.
 ```kotlin
 window.addMouseListener(
  object : MouseAdapter() { // MouseAdapter를 확장하는 무명 객체를 선언한다.
    override fun mouseClicked(e: MouseEvent) { // MouseAdapter의 메서드를
      ...
    }

    override fun mouseEntered(e: MouseEvent) { // 오버라이드 한다.
      ...
    }
  }
 })
 ```
 
 객체에 이름을 붙여야 한다면 변수에 무명 객체를 대입하면 된다.
 ```kotlin
 val listener = object : MouseAdapter() {
  override fun mouseClicked(e: MouseEvent) { ... }
  override fun mouseEntered(e: MouseEvent) { ... }
 }
 ```

 한 인터페이스만 구현하거나 한 클래스만 확장할 수 있는 자바의 무명 내부 클래스와 달리 코틀린 무명 클래스는 여러 인터페이스를 구현하거나 클래스를 확장하면서 인터페이스를 구현할 수 있다.

 자바의 무명 클래스와 같이 객체 식 안의 코드는 그 식이 포함된 함수의 변수에 접근할 수 있다. 하지만 자바와 달리 final이 아닌 변수도 객체 식 안에서 사용할 수 있다. 따라서 객체 식 안에서 그 변수의 값을 변경할 수 있다.
 ```kotlin
 fun countClicks(window: Window) {
  var clickCount = 0 // 로컬 변수를 정의한다.

  window.addMouseListener(object: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
      clickCount++ // 로컬 변수의 값을 변경한다.
    }
  })
 }
 ```

# 05장 람다로 프로그래밍
 * 람다 식 또는 람다는 기본적으로 다른 함수에 넘길 수 있는 작은 코드 조각을 뜻한다.
 * 람다를 사용하면 쉽게 공통 코드 구조를 라이브러리 함수로 뽑아낼 수 있다.
 * 수신 객체 지정 람다는 특별한 람다로, 람다 선언을 둘러싸고 있는 환경과는 다른 상황에서 람다 본문을 실행할 수 있다.

 ## 1. 람다 식과 멤버 참조

 ### 람다 소개: 코드 블록을 함수 인자로 넘기기
 무명 내부 클래스를 사용하면 코드를 함수에 넘기거나 변수에 저장할 수 있기는 하지만 상당히 번거롭다. 이와 달리 함수형 프로그래밍에서는 **함수를 값처럼 다루는 접근 방법**을 택함으로써 이 문제를 해결한다. 클래스를 선언하고 그 클래스의 인스턴스를 함수에 넘기는 대신 함수형 언어에서는 **함수를 직접 다른 함수에 전달할 수 있다. 람다 식을 사용하면 함수를 선언할 필요가 없고 코드 불록을 직접 함수의 인자로 전달할 수 있다.**
 ```kotlin
 // 자바
 button.setOnClickListener(new OnClickListener() {
  @Override
  public void onClick(View view) {
    // 클릭 시 수행할 동작
  }
 });
 ```

 앞의 자바코드를 코틀린에서는 자바 8과 마찬가지로 람다를 쓸 수 있다.
 ```kotlin
 button.setOnClickListener { /* 클릭 시 수행할 동작 */ }
 ```

 ### 람다와 컬렉션
 모든 컬렉션에 대해 maxBy 함수를 호출할 수 있다. maxBy는 가장 큰 원소를 찾기 위해 비교에 사용할 값을 돌려주는 함수를 인자로 받는다. 중괄호로 둘러싸인 코드 { it. age }는 바로 비교에 사용할 값을 돌려주는 함수다. 이 코드는 컬렉션의 원소를 인자로 받아서(it이 그 인자를 가리킨다) 비교에 사용할 값을 반환한다.
 ```kotlin
 >>> val people = listOf(Person("Alice", 29), Person("Bob", 31))
 >>> println(people.maxBy { it. age }) // 나이 프로퍼티를 비교해서 값이 가장 큰 원소 찾기
 Person(name=Bob, age=31)
 ```

 이런 식으로 단지 함수나 프로퍼티를 반환하는 역할을 수행하는 람다는 멤버 참조로 대치할 수 있다.
 ```kotlin
 people.maxBy(Person::age)
 ```
 자바 컬렉션에 대해(자바 8 이전에) 수행하던 대부분의 작업은 람다나 멤버 참조를 인자로 취하는 라이브러리 함수를 통해 개선할 수 있다.

 ### 람다식의 문법
 람다는 값처럼 여기저기 전달할 수 있는 동작의 모음이다. 람다를 따로 선언해서 변수에 저장할 수도 있다. 하지만 함수에 인자로 넘기면서 바로 람다를 정의하는 경우가 대부분이다. 아래 식은 람다 식을 선언하기 위한 문법이다.
 ```kotlin
 { x: Int, y: Int -> x + y } // 항상 중괄호 사이에 위치함

 x: Int, y: Int // 파라미터
 x + y // 본문
 ```

 람다 식을 변수에 저장할 수 있다. 람다가 저장된 변수를 다른 일반 함수와 마찬가지로 다룰 수 있다.(변수 이름 뒤에 괄호를 놓고 그 안에 필요한 인자를 넣어서 람다를 호출할 수 있다).
 ```kotlin
 >>> val sum = { x: Int, y: Int -> x + y }
 >>> println(sum(1, 2)) // 3
 ```
 
 원한다면 람다 식을 직접 호출해도 된다.
 ```kotlin
 >>> { println(42) } () // 42
 ```
 하지만 이와 같은 구문은 읽기 어렵고 그다지 쓸모도 없다. 굳이 람다를 만들자마자 바로 호출하느니 람다 본문을 직접 실행하는 편이 낫다.

 이렇게 코드의 일부분을 블록으로 둘러싸 실행할 필요가 있다면 run을 사용한다. run은 인자로 받은 람다를 실행해주는 라이브러리 함수다.
 ```kotlin
 >>> run { println(42) } // 42
 ```
 실행 시점에 코틀린 람다 호출에는 아무 부가 비용이 들지 않으며, 프로그램의 기본 구성 요소와 비슷한 성능을 낸다.

 이전의 예제에서 코틀린이 코드를 줄여 쓸 수 있게 제공했던 기능을 제거하고 정식으로 람다를 작성하면 다음과 같다.
 ```kotlin
 people.maxBy({ p: Person -> p.age })
 ```
 위의 코드는 번잡하다. 따라서 다음과 같은 개선점을 적용할 수 있다.
 * 코틀린에는 함수 호출 시 맨 뒤에 있는 인자가 람다 식이라면 그 람다를 괄호 밖으로 빼낼 수 있다는 문법 관습이 있다.
 * 람다가 어떤 함수의 유일한 인자이고 괄호 뒤에 람다를 썼다면 호출 시 빈 괄호를 없애도 된다.
 * 로컬 변수처럼 컴파일러는 람다 파라미터의 타입도 추론할 수 있다. 따라서 파라미터 타입을 명시할 필요가 없다.
 * 람다의 파라미터가 하나뿐이고 그 타입을 컴파일러가 추론할 수 있는 경우 디폴트 이름인 it을 바로 쓸 수 있다.
 ```kotlin
 people.maxBy() { p: Person -> p.age } // (1) 람다를 괄호 밖으로 이동
 people.maxBy { p: Person -> p.age } // (2) 빈 괄호 제거
 people.maxBy { p -> p.age } // (3) 파라미터 제거
 people.maxBy { it.age } // (4) "it"은 자동 생성된 파라미터 이름이다.
 ```
 둘 이상의 람다를 인자로 받는 함수는 인자 목록의 맨 마지막 람다만 밖으로 뺄 수 있다. 따라서 그런 경우에는 괄호를 사용하는 일반적인 함수 호출 구문을 사용하는 편이 낫다.

 ### 현재 영역에 있는 변수에 접근
 자바 메서드 안에서 무명 내부 클래스를 정의할 때 메서드의 로컬 변수를 무명 내부 클래스에서 사용할 수 있다. 람다 안에서도 같은 일을 할 수 있다. 람다를 함수 안에서 정의하면 함수의 파라미터뿐 아니라 람다 정의의 앞에 선언된 로컬 변수까지 람다에서 모두 사용할 수 있다.
 ```kotlin
 fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
  messages.forEach { // 각 원소에 대해 수행할 작업을 람다로 받는다.
    println("$prefix $it") // 람다 안에서 함수의 "prefix" 파라미터를 사용한다.
  }
 }
 >>> val errors = listOf("403 Forbidden", "404 Not Found")
 >>> printMessagesWithPrefix(errors, "Error:")
 Error: 403 Forbidden
 Error: 404 Not Found
 ```

 자바와 다른 점 중 중요한 한 가지는 코틀린 람다 안에서는 파이널 변수가 아닌 변수에 접근할 수 있다는 점이다. 또한 람다 안에서 바깥의 변수를 변경해도 된다.
 ```kotlin
 fun printProblemCounts(responses: Collection<String>) {
  var clientErrors = 0 // 람다에서 사용할 변수를
  var serverErrors = 0 // 정의한다.
  responses.forEach {
    if (it.startsWith("4")) {
      clientErrors++  // 람다 안에서 람다 밖의 변수를
    } else if (it.startsWith("5")) {
      serverErrors++ // 변경한다.
    }
  }
  println("$clientErrors client errors, $serverErrors server errors")
 }
 >>> val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
 >>> printProblemCounts(responses) // 1 client errors, 1 server errors
 ```
 이 예제의 prefix, clientErrors, serverErrors와 같이 람다 안에서 사용하는 외부 변수를 **람다가 포획한 변수**라고 부른다.

 기본적으로 함수 안에 정의된 로컬 변수의 생명주기는 함수가 반환되면 끝난다. 하지만 어떤 함수가 자신의 로컬 변수를 포획한 람다를 반환하거나 다른 변수에 저장한다면 로컬 변수의 생명주기와 함수의 생명주기가 달라질 수 있다. 포획한 변수가 있는 람다를 저장해서 함수가 끝난 뒤에 실행해도 람다의 본문 코드는 여전히 포획한 변수를 읽거나 쓸 수 있다. 어떻게 그런 동작이 가능할까? 파이널 변수를 포획한 경우에는 람다 코드를 변수 값과 함께 저장한다. 파이널이 아닌 변수를 포획한 경우에는 변수를 특별한 래퍼로 감싸서 나중에 변경하거나 읽을 수 있게 한 다음, 래퍼에 대한 참조를 람다 코드와 함께 저장한다. 

 #### 변경 가능한 변수 포획하기: 자세한 구현 방법
 자바에서는 파이널 변수만 포획할 수 있다. 하지만 교묘한 속임수를 통해 변경 가능한 변수를 포획할 수 있다. 그 속임수는 변경 가능한 변수를 저장하는 원소가 단 하나뿐인 배열을 선언하거나, 변경 가능한 변수를 필드로 하는 클래스를 선언하는 것이다(안에 들어있는 원소는 변경 가능 할지라도 배열이나 클래스의 인스턴스에 대한 참조를 final로 만들면 포획이 가능하다).

 이런 속임수를 코틀린으로 작성하면 다음과 같다.
 ```kotlin
 class Ref<T>(var value: T) // 변경 가능한 변수를 포획하는 방법을 보여주기 위한 클래스
 >>> val counter = Ref(0)
 >>> val inc = { counter.value++ } // 공식적으로는 변경 불가능한 변수를 포획했지만 그 변수가 가리키는 객체의 필드 값을 바꿀 수 있다.
 ```

 실제 코드에서는 이런 래퍼를 만들지 않아도 된다. 대신, 변수를 직접 바꾼다.
 ```kotlin
 var counter = 0
 val inc = { counter++ }
 ```
 첫 번째 예제는 두 번째 예제가 작동하는 내부 모습을 보여준다. 람다가 파이널 변수(val)를 포획하면 자바와 마찬가지로 그 변수의 값이 복사된다. 하지만 람다가 변경 가능한 함수(var)를 포획하면 변수를 Ref 클래스 인스턴스에 넣는다. 그 Ref 인스턴스에 대한 참조를 파이널로 만들면 쉽게 람다로 포획할 수 있고, 람다 안에서는 Ref 인스턴스의 필드를 변경할 수 있다.

 한 가지 꼭 알아둬야 할 함정이 있다. 람다를 이벤트 핸들러나 다른 비동기적으로 실행되는 코드로 활용하는 경우 함수 호출이 끝난 다음에 로컬 변수가 변경될 수도 있다.
 ```kotlin
 fun tryToCountButtonClicks(button: Button): Int {
  var clicks = 0
  button.onClick { clicks++ }
  return clicks
 }
 ```
 이 함수는 항상 0을 반환한다. onClick 핸들러는 호출될 때마다 clicks의 값을 증가시키지만 그 값의 변경을 관찰할 수는 없다. 핸들러는 tryToCountButtonClicks가 clicks를 반환한 다음에 호출되기 때문이다. 이 함수를 제대로 구현하려면 클릭 횟수를 세는 카운터 변수를 함수의 내부가 아니라 클래스의 프로퍼티나 전역 프로퍼티 등의 위치로 빼내서 나중에 변수 변화를 살펴볼 수 있게 해야 한다.

 ### 멤버 참조
 다른 함수의 인자로 넘기려는 코드가 이미 함수로 선언된 경우에는 함수를 직접 넘길 수 있다. 이때 이중 콜론(::)을 사용한다.
 ```kotlin
 val getAge = Person::age
 ```
 ::를 사용하는 식을 **멤버 참조**라고 부른다. 멤버 참조는 프로퍼티나 메서드를 단 하나만 호출하는 함수 값을 만들어준다. ::는 클래스 이름과 여러분이 참조하려는 멤버(프로퍼티나 메서드) 이름 사이에 위치한다.
 ```kotlin
 Person::age

 Person // 클래스
 :: // ::으로 구분
 age // 멤버
 ```

 Person::age는 같은 역할을 하는 다음 람다 식을 더 간략하게 표현한 것이다.
 ```kotlin
 val getAge = { person: Person -> person.age }
 ```
 참조 대상이 함수인지 프로퍼티인지와는 관계없이 멤버 참조 뒤에는 괄호를 넣으면 안된다.

 멤버 참조는 그 멤버를 호출하는 람다와 같은 타입이다.
 ```kotlin
 people.maxBy(Person::age)
 people.maxBy { p -> p.age }
 people.maxBy { it.age }
 ```

 최상위에 선언된(그리고 다른 클래스의 멤버가 아닌) 함수나 프로퍼티를 참조할 수도 있다.
 ```kotlin
 fun salute() = println("Salute!")
 >>> run(::salute) // Salute!
 ```
 클래스 이름을 생략하고 ::로 참조를 바로 시작한다.

 람다가 인자가 여럿인 다른 함수한테 작업을 위임하는 경우 람다를 정의하지 않고 직접 위임 함수에 대한 참조를 제공하면 편리하다.
 ```kotlin
 val action = { person: Person, message: String -> // 이 람다는 sendEmail 함수에게 작업을 위임한다.
  sendEmail(person, message)}
 val nextAction = ::sendEmail // 람다 대신 멤버 참조를 쓸 수 있다.
 ```

 생성자 참조를 사용하면 클래스 생성 작업을 연기하거나 저장해둘 수 있다. :: 뒤에 클래스 이름을 넣으면 생성자 참조를 만들 수 있다.
 ```kotlin
 data class Person(val name: String, val age: Int)
 >>> val createPerson = ::Person
 >>> val p = createPerson("Alice", 29)
 >>> println(p) // Person(name=Alice, age=29)
 ```

 확장 함수도 멤버 함수와 똑같은 방식으로 참조할 수 있다.
 ```kotlin
 fun Person.isAdult() = age >= 21
 val predicate = Person::isAdult
 ```

 ## 2. 컬렉션 함수형 API
 함수형 프로그래밍 스타일을 사용하면 컬렉션을 다룰 때 편리하다. 대부분의 작업에 라이브러리 함수를 활용할 수 있고 그로 인해 코드를 아주 간결하게 만들 수 있다.

 ### 필수적인 함수: filter와 map
 filter 함수는 컬렉션을 이터레이션하면서 주어진 람다에 각 원소를 넘겨서 람다가 true를 반환하는 원소만 모은다.
 ```kotlin
 >>> val list = listOf(1, 2, 3, 4)
 >>> println(list.filter { it % 2 == 0 }) // 짝수만 남는다. [2, 4]

 >>> val people = listOf(Person("Alice", 29), Person("Bob", 31))
 >>> println(people.filter { it.age > 30 }) // [Person(name=Bob, age=31)]
 ```
 filter 함수는 컬렉션에서 원치 않는 원소를 제거한다. 하지만 filter는 원소를 변환 할 수는 없다. 원소를 변환하려면 map 함수를 사용해야 한다.

 map함수는 주어진 람다를 컬렉션의 각 원소에 적용한 결과를 모아서 새 컬렉션을 만든다.
 ```kotlin
 >>> val list = listOf(1, 2, 3, 4)
 >>> println(list.map { it * it }) // [1, 4, 9, 16]

 >>> val people = listOf(Person("Alice", 29), Person("Bob", 31))
 >>> println(people.map { it.name }) // [Alice, Bob]
 ```

 filter와 map을 연쇄시킬 수 있다.
 ```kotlin
 >>> people.filter { it.age > 30 }.map(Person::name) // [Bob]
 ```

 목록에서 가장 나이 많은 사람의 이름을 알고 싶다고 할 때, 먼저 목록에 있는 사람들의 나이의 최댓값을 구하고 나이가 그 최댓값과 같은 모든 사람을 반환하면 된다. 하지만 다음 코드는 목록에서 최댓값을 구하는 작업을 계속 반복한다는 단점이 있다.
 ```kotlin
 people.filter { it.age == people.maxBy(Person::age)!!.age }
 ```

 다음 코드는 이를 좀 더 개선해 최댓값을 한 번만 계산하게 만든 코드다.
 ```kotlin
 val maxAge = people.maxBy(Person::age)!!.age
 people.filter { it.age == maxAge }
 ```
 꼭 필요하지 않는 경우 계산을 반복하면 안된다. 람다를 인자로 받는 함수에 람다를 넘기면 겉으로 볼 때는 단순해 보이는 식이 내부 로직의 복잡도로 인해 실제로는 엄청나게 불합리한 계산식이 될 때가 있다.

 필터와 변환 함수를 맵에 적용할 수도 있다.
 ```kotlin
 >>> val numbers = mapOf(0 to "zero", 1 to "one")
 >>> println(numbers.mapValues { it.value.toUpperCase() }) // {0=ZERO, 1=ONE}
 ```
 맵의 경우 키와 값을 처리하는 함수가 따로 존재한다. filterKeys와 mapKeys는 키를 걸러 내거나 변환하고, filterValues와 mapValues는 값을 걸러 내거나 변환한다.

 ### all, any, count, find: 컬렉션에 술어 적용
 * all : 컬렉션의 모든 원소가 어떤 조건을 만족하는지 판단하는 연산
 ```kotlin
 >>> val canBeInClub27 = { p: Person -> p.age <= 27 }
 >>> val people = listOf(Person("Alice", 27), Person("Bob", 31))
 >>> println(people.all(canBeInClub27)) // false
 ```

 * any : 컬렉션 안에 어떤 조건을 만족하는 원소가 있는지 판단하는 연산
 ```kotlin
 >>> println(people.any(canBeInClub27)) // true
 ```

 어떤 조건에 대해 !all을 수행한 결과와 그 조건의 부정에 대해 any를 수행한 결과는 같다(드 모르간의 법칙). 또 어떤 조건에 대해 !any를 수행한 결과와 그 조건의 부정에 대해 all을 수행한 결과도 같다. 가독성을 높이려면 any와 all 앞에 !를 붙이지 않는 편이 낫다.
 ```kotlin
 >>> val list = listOf(1, 2, 3)

 >>> println(!list.all { it == 3 }) // true 
 >>> println(list.any { it != 3 }) // true
 ```

 * count : 조건을 만족하는 원소의 개수를 반환하는 연산
 ```kotlin
 >>> val people = listOf(Person("Alice", 27), Person("Bob", 31))
 >>> println(people.count(canBeInClub27)) // 1
 ```

 * find : 조건을 만족하는 첫 번째 원소를 반환하는 연산
 ```kotlin
 >>> val people = listOf(Person("Alice", 27), Person("Bob", 31))
 >>> println(people.find(canBeInClub27)) // Person(name=Alice, age=27)
 ```
 만족하는 원소가 전혀 없는 경우 null을 반환한다. find는 firstOrNull과 같다.

 ### groupBy: 리스트를 여러 그룹으로 이뤄진 맵으로 변경
 컬렉션의 모든 원소를 어떤 특성에 따라 여러 그룹으로 나누고 싶다고 할 때 groupBy를 사용할 수 있다.
 ```kotlin
 >>> val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
 >>> println(people.groupBy { it.age })
 // {29=[Person(name=Bob, age=29)], 31=[Person(name=Alice, age=31), Person(name=Carol, age=31)]}
 ```
 이 연산의 결과는 컬렉션의 원소를 구분하는 특성(이 예제에서는 age)이 키이고, 키 값에 따른 각 그룹(이 예제에서는 Person 객체의 모임)이 값인 맵이다.
 ![](../assets/kotlin-collection-groupBy-flow.png)

 각 그룹은 리스트다. 따라서 groupBy의 결과 타입은 Map<Int, List\<Person>>이다. 필요하면 이 맵을 mapKeys나 mapValues 등을 사용해 변경할 수 있다.

 ### flatMap과 flatten: 중첩된 컬렉션 안의 원소 처리
 * flatMap : 인자로 주어진 람다를 컬렉션의 모든 객체에 적용하고(또는 매핑하기) 람다를 적용한 결과 얻어지는 여러 리스트를 한 리스트로 한데 모은다(또는 펼치기).
 ```kotlin
 >>> val strings = listOf("abc", "def")
 >>> println(strings.flatMap { it.toList() }) // [a, b, c, d, e, f]
 ```
 toList 함수를 문자열에 적용하면 그 문자열에 속한 모든 문자로 이뤄진 리스트가 만들어진다. map과 toList를 함께 사용하면 다음 그림의 가운데 줄에 표현한 것처럼 문자로 이뤄진 리스트로 이뤄진 리스트가 생긴다. flatMap 함수는 다음 단계로 리스트의 리스트에 들어있던 모든 원소로 이뤄진 단일 리스트를 반환한다.

 ![](../assets/kotlin-collection-flatMap-flow.png)

 flatMap 함수는 모든 책의 작가를 평평한(문자열만으로 이뤄진) 리스트 하나로 모은다. toSet은 flatMap의 결과 리스트에서 중복을 없애고 집합으로 만든다.
 ```kotlin
 class Book(val title: String, val authors: List<String>)

 >>> val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                        Book("Mort", listOf("Terry Pratchett")),
                        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
 >>> println(books.flatMap { it.authors }.toSet()) // books 컬렉션에 있는 책을 쓴 모든 저자의 집합
 // [Jasper Fforde, Terry Pratchett, Neil Gaiman]
```

리스트의 리스트가 있는데 모든 중첩된 리스트의 원소를 한 리스트로 모아야 한다면 flatMap을 떠올릴 수 있다. 하지만 특별히 변환해야 할 내용이 없다면 리스트의 리스트를 평평하게 펼치기만 하면 된다. 그런 경우 listOfLists.flatten() 처럼 flatten 함수를 사용할 수 있다.