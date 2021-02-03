A rendre avant JEUDI 4/02 AVANT midi.
Adresse mail : philippot.sebastien@gmail.com
Répository : github ou gitlab
Attention :  Mettez des commentaires pour vos explications issues de vos initiatives. Pas besoin de commenter la mise en place du projet, ni ce qu’est une Servlet etc…
Exigences votre projet doit être découpé en plusieurs couches applicatives

Client - Nous vous demandons de créer un système de facturation. Nous souhaitons pouvoir créer des clients, des articles et des factures.
Chef de projet – Pouvez vous nous décrire la fiche client ? 
Client – Oui elle est très simple, pour nous un client a un nom,  une adresse
Chef de projet – je vois, pouvez vous nous décrire la fiche article ?
Client – Elle est très simple également, l’article doit avoir un nom, un code barre et un prix.
Chef de projet – et une facture pour vous c’est quoi ?
Client – Une facture a un client, un liste de produit, pour chaque produit on peut mettre une quantité et le montant de la ligne est calculé par le logiciel
Chef de projet – merci nous allons étudier tout ça.

Ce schéma a été réalisé suite à l’étude du concepteur
 
Un client peut faire plusieurs factures, une facture appartient à un seul client. Une facture est composée de plusieurs « ligneFacture ». Celles-ci appartiennent seulement à une seule facture. Une ligneFature a un seul produit.
Nous souhaitons affficher la facture de cette manière là
 

Pouvez-vous développer la gestion des clients 
 
C’est la même chose avec les articles.
 
Il doit y avoir un formulaire de création des articles et des clients. Nous ne ferons pas le formulaire de création de facture. Seulement afficher la liste
 

