
INSERT INTO users (username, email, password, enabled) VALUES
  ('DomSon', 'sondermann@fh-muenster.de', '1234',true),
  ('John Doe', 'john@doe.de', '1234',true);

INSERT INTO characters (user_id,char_name, char_type, rank,
                       health_points_max, stamina_points_max,
                       health_points, stamina_points,
                       strength, dexterity, agility,
                       constitution, intelligence,
                       magictalent, appearance,
                       charisma, willpower,
                       range, brawl,
                       stamina_bonus, damage_bonus,
                       attack_bonus, defence_bonus,
                       res_bonus_mind, res_bonus_body,
                       conjuring_bonus,
                       defence, resistance, conjuring
) VALUES
  (1,'Char1', 'Spitzbube', 1,
            17, 15,
            17, 15,
            88, 99, 74,
            85, 67,
                34, 56,
                78, 37,
                24, 8,
                2, 3,
                1, 2, 2, 2, 0, 11, 11,
   '1234');

