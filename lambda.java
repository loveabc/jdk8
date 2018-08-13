List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(8);
		list.add(10);
		list.add(-10);
		list.add(2);
		list.add(10);
		
		System.out.println(list.stream().count());
		System.out.println(list.stream().filter(data -> data < 7).count());
		System.out.println(list.stream().reduce(0, (a , b) -> a + b));
