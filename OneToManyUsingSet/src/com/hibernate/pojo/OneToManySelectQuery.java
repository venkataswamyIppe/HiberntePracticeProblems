package com.hibernate.pojo;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManySelectQuery {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		//Retrieve data using parent table primary key id
		Team tm=(Team) session.get(Team.class,new Integer(1));
		System.out.println("================================");
		System.out.println("Team Id :"+tm.getTid());
		System.out.println("Team Name :"+tm.getTname());
		Set<Player>players=tm.getPlayers();
		System.out.println("Team size :"+players.size());
		System.out.println("================================");
		for(Player player:players)
		{
			
			System.out.println("player Id :"+player.getPid());
			System.out.println("player Name :"+player.getPname());
			System.out.println("================================");
		}
	}

}
