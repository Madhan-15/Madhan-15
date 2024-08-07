����   B �
      java/lang/Object <init> ()V  java/util/ArrayList
  	      com/ecommerce/models/Cart items Ljava/util/List;      java/util/List iterator ()Ljava/util/Iterator;      java/util/Iterator hasNext ()Z     next ()Ljava/lang/Object; ! com/ecommerce/models/CartItem
   # $ % 
getProduct  ()Lcom/ecommerce/models/Product;
 ' ( ) * + com/ecommerce/models/Product getName ()Ljava/lang/String;
 - . / 0 1 java/lang/String equals (Ljava/lang/Object;)Z
   3 4 5 getQuantity ()I
   7 8 9 setQuantity (I)V
 ' ; <  clone
   >  ? "(Lcom/ecommerce/models/Product;I)V  A B 1 add   D E F test 2(Ljava/lang/String;)Ljava/util/function/Predicate;  H I J removeIf !(Ljava/util/function/Predicate;)Z  L M  isEmpty	 O P Q R S java/lang/System out Ljava/io/PrintStream; U Your cart is empty.
 W X Y Z [ java/io/PrintStream println (Ljava/lang/String;)V
 W ] Z ^ (Ljava/lang/Object;)V
   ` a b getTotalPrice ()D 	Signature 1Ljava/util/List<Lcom/ecommerce/models/CartItem;>; Code LineNumberTable 
addProduct StackMapTable 
Exceptions k $java/lang/CloneNotSupportedException updateQuantity (Ljava/lang/String;I)V removeProduct displayCart calculateTotalBill lambda$removeProduct$0 4(Ljava/lang/String;Lcom/ecommerce/models/CartItem;)Z 
SourceFile 	Cart.java BootstrapMethods 1 x
  y q r { "(Lcom/ecommerce/models/CartItem;)Z }
 ~  � � � "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !          c    d      e   0     *� *� Y� 	� 
�    f       	  
    g ?  e   �     Z*� 
�  N-�  � 0-�  �  :� "� &+� &� ,� � 2`� 6����*� 
�  Y+� :� '� =� @ W�    f          0  <  =  @  Y  h    � 
 2�  i     j  l m  e   v     8*� 
�  N-�  � '-�  �  :� "� &+� ,� 
� 6���ֱ    f          -  3  4  7  h    � 
 )�   n [  e   -     *� 
+� C  � G W�    f   
    !  "  o   e        =*� 
� K � � NT� V�*� 
�  L+�  � +�  �  M� N,� \���    f       %  &  '  ) 2 * 9 + < , h    � 	 �   p b  e   g     -H*� 
�  N-�  � -�  �  :'� _cH���'�    f       /  0   1 ( 2 + 3 h    �  � 
 q r  e   $     +� "� &*� ,�    f       !  s    t u     |  v w z �   
  � � � 